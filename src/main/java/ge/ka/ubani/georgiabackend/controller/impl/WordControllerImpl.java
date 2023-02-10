package ge.ka.ubani.georgiabackend.controller.impl;

import ge.ka.ubani.georgiabackend.controller.WordController;
import ge.ka.ubani.georgiabackend.dto.WordAddingRequestDto;
import ge.ka.ubani.georgiabackend.dto.WordDto;
import ge.ka.ubani.georgiabackend.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class WordControllerImpl implements WordController {

    private final WordService wordService;

    @Override
    public ResponseEntity<WordDto> getById(UUID id) {
        var response = wordService.getById(id);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<List<WordDto>> findAll(String value) {
        var response = wordService.findAll(value);
        return ResponseEntity.ok(response);
    }

    @Override
    public  ResponseEntity<List<WordDto>> findAllRootWords(String value) {
        List<WordDto> response = wordService.getRootWord(value);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<WordDto> saveWord(WordAddingRequestDto requestDto) {
        var response = wordService.saveWord(requestDto);
        return ResponseEntity.ok(response);
    }
}
