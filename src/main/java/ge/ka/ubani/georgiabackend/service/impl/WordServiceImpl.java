package ge.ka.ubani.georgiabackend.service.impl;

import ge.ka.ubani.georgiabackend.dto.WordAddingRequestDto;
import ge.ka.ubani.georgiabackend.dto.WordDto;
import ge.ka.ubani.georgiabackend.service.WordJpaService;
import ge.ka.ubani.georgiabackend.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordJpaService wordJpaService;

    @Override
    public WordDto getById(UUID id) {
        return wordJpaService.getById(id);
    }

    @Override
    public WordDto saveWord(WordAddingRequestDto requestDto) {
        return wordJpaService.saveWord(requestDto);
    }

    @Override
    public List<WordDto> findAll(String value) {
        return wordJpaService.findAll(value).stream()
            .distinct()
            .toList();
    }

    @Override
    public List<WordDto> getRootWord(String value) {
        return wordJpaService.getRootWord(value);
    }
}
