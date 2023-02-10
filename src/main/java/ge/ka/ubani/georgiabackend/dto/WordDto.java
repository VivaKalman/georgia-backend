package ge.ka.ubani.georgiabackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ge.ka.ubani.georgiabackend.enums.SpeechPartType;
import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
@JsonDeserialize(builder = WordDto.WordDtoBuilder.class)
public class WordDto {
    @JsonProperty
    UUID id;
    @JsonProperty
    String word;
    @JsonProperty
    SpeechPartType type;
    @JsonProperty
    String meaning;
    @JsonProperty
    String translate;
    @JsonProperty
    WordDto refWord;
    @JsonProperty
    NounDto noun;
    @JsonProperty
    AdjectiveDto adjective;
    @JsonProperty
    VerbDto verb;
}
