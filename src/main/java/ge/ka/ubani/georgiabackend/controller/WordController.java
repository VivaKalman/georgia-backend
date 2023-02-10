package ge.ka.ubani.georgiabackend.controller;

import ge.ka.ubani.georgiabackend.dto.WordAddingRequestDto;
import ge.ka.ubani.georgiabackend.dto.WordDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("v1")
public interface WordController {

    @PostMapping("/word")
    ResponseEntity<WordDto> saveWord(@RequestBody WordAddingRequestDto requestDto);

}
