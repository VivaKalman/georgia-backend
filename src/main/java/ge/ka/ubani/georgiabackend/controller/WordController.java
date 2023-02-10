package ge.ka.ubani.georgiabackend.controller;

import ge.ka.ubani.georgiabackend.dto.WordAddingRequestDto;
import ge.ka.ubani.georgiabackend.dto.WordDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@RequestMapping("v1")
public interface WordController {


    @GetMapping("word/{id}")
    ResponseEntity<WordDto>  getById(@PathVariable UUID id);

    @GetMapping("/word")
    ResponseEntity<List<WordDto>> findAll(@RequestParam("value") String value);

    @GetMapping("/word/rootword/{id}")
    ResponseEntity<List<WordDto>> findAllRootWords(@RequestParam("value") String value);

    @PostMapping("/word")
    ResponseEntity<WordDto> saveWord(@RequestBody WordAddingRequestDto requestDto);

}
