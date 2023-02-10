package ge.ka.ubani.georgiabackend.service;

import ge.ka.ubani.georgiabackend.dto.WordAddingRequestDto;
import ge.ka.ubani.georgiabackend.dto.WordDto;

import java.util.List;
import java.util.UUID;

public interface WordJpaService {

    WordDto getById(UUID id);

    WordDto saveWord(WordAddingRequestDto requestDto);

    List<WordDto> findAll(String value);

    List<WordDto> getRootWord(String value);
}
