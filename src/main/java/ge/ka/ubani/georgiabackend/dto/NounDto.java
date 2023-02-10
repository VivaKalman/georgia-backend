package ge.ka.ubani.georgiabackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
@JsonDeserialize(builder = NounDto.NounDtoBuilder.class)
@EqualsAndHashCode(of = "id")
public class NounDto {
    @JsonProperty
    UUID id;
    @JsonProperty
    String singular;
    @JsonProperty
    String plural;
    @JsonProperty
    String nominative;
    @JsonProperty
    String ergative;
    @JsonProperty
    String dative;
    @JsonProperty
    String genitive;
    @JsonProperty
    String instrumental;
    @JsonProperty
    String adverbial;
    @JsonProperty
    String vocative;
}
