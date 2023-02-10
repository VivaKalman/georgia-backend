package ge.ka.ubani.georgiabackend.service.impl;

import ge.ka.ubani.georgiabackend.dto.WordAddingRequestDto;
import ge.ka.ubani.georgiabackend.dto.WordDto;
import ge.ka.ubani.georgiabackend.entity.RootWord;
import ge.ka.ubani.georgiabackend.exception.NotFoundException;
import ge.ka.ubani.georgiabackend.mapper.WordMapper;
import ge.ka.ubani.georgiabackend.repository.RootWordRepository;
import ge.ka.ubani.georgiabackend.service.WordJpaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WordJpaServiceImpl implements WordJpaService {

    private final RootWordRepository repository;
    private final WordMapper mapper;

    @Override
    public WordDto getById(UUID id) {
        return repository.findById(id)
            .map(mapper::entityToDto)
            .orElseThrow(() -> NotFoundException.notFoundById("RootWord", id));
    }

    @Override
    public WordDto saveWord(WordAddingRequestDto requestDto) {
        var entity = mapper.requestToEntity(requestDto);
        entity.setRootWord(requestDto.getRefWordId() == null);
        if (requestDto.getRefWordId() != null) {
            entity.setRefWord(RootWord.builder().id(requestDto.getRefWordId()).build());
        }
        return mapper.entityToDto(repository.save(entity));
    }

    @Override
    public List<WordDto> findAll(String value) {
        return repository.findAllByWordContains(value).stream()
            .map(mapper::entityToDto)
            .toList();
    }

    @Override
    public List<WordDto> getRootWord(String value) {
        return repository.findDistinctByWordContainingAndRootWordTrue(value).stream()
            .map(mapper::entityToDto)
            .toList();
    }
}
