package ge.ka.ubani.georgiabackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
@JsonDeserialize(builder = AdjectiveDto.AdjectiveDtoBuilder.class)
@EqualsAndHashCode(of = "id")
public class AdjectiveDto {
    @JsonProperty
    UUID id;
    @JsonProperty
    String positive;
    @JsonProperty
    String comparative;
    @JsonProperty
    String superlative;
}
