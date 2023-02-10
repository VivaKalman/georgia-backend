package ge.ka.ubani.georgiabackend;

import ge.ka.ubani.georgiabackend.entity.Adjective;
import ge.ka.ubani.georgiabackend.entity.Noun;
import ge.ka.ubani.georgiabackend.entity.RootWord;
import ge.ka.ubani.georgiabackend.entity.UseCase;
import ge.ka.ubani.georgiabackend.enums.SpeechPartType;
import ge.ka.ubani.georgiabackend.repository.RootWordRepository;
import ge.ka.ubani.georgiabackend.repository.UseCaseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Log4j2
//@Component
@RequiredArgsConstructor
public class TestRunner implements CommandLineRunner {

    private final RootWordRepository repository;
    private final UseCaseRepository useCaseRepository;

    @Override
    public void run(String... args) throws Exception {
//        RootWord rootWord = RootWord.builder()
//            .word("ბავშვი")
//            .type(SpeechPartType.NOUN)
//            .translate("ребенок, child")
//            .noun(
//                Noun.builder()
//                    .singular("ბავშვი")
//                    .plural("ბავშვები")
//                    .nominative("ბავშვი")
//                    .build()
//            )
//            .adjective(
//                Adjective.builder()
//                    .positive("positive")
//                    .comparative("comparative")
//                    .superlative("superlative")
//                    .build()
//            )
//            .build();
//
//        RootWord saved = repository.save(rootWord);
//        UseCase useCase1 = UseCase.builder()
//            .rootWordId(saved.getId())
//            .origin("ბავშვი თამაშობს")
//            .translate("ребенок играет")
//            .build();
//        UseCase useCase2 = UseCase.builder()
//            .rootWordId(saved.getId())
//            .origin("ბავშვი თამაშობს 2")
//            .translate("ребенок играет 2")
//            .build();
//        useCaseRepository.saveAll(List.of(useCase1, useCase2));


//        Optional<RootWord> byId = repository.findById(UUID.fromString("5da2c556-c84a-428c-a223-1096f99134ae"));
//
//        RootWord rootWord2 = RootWord.builder()
//            .word("ბავშვი")
//            .type(SpeechPartType.NOUN)
//            .meaning("ребенок, child")
//            .refWord(byId.get())
//            .noun(
//                Noun.builder()
//                    .singular("სახლი")
//                    .plural("სახლი")
//                    .nominative("სახლი")
//                    .build()
//            )
//            .build();
//
//        repository.save(rootWord2);



        List<RootWord> all = repository.findAll();
        log.info(all);
    }
}
