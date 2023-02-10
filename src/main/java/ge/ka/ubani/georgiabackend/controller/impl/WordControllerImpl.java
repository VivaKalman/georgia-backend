package ge.ka.ubani.georgiabackend.controller.impl;

import ge.ka.ubani.georgiabackend.controller.WordController;
import ge.ka.ubani.georgiabackend.dto.WordAddingRequestDto;
import ge.ka.ubani.georgiabackend.dto.WordDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class WordControllerImpl implements WordController {

    @Override
    public ResponseEntity<WordDto> saveWord(WordAddingRequestDto requestDto) {
        return ResponseEntity.ok(
            WordDto.builder()
                .id(UUID.randomUUID())
            .build()
        );
    }
}
