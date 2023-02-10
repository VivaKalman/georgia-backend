package ge.ka.ubani.georgiabackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
@JsonDeserialize(builder = VerbDto.VerbDtoBuilder.class)
@EqualsAndHashCode(of = "id")
public class VerbDto {
    @JsonProperty
    UUID id;
    @JsonProperty
    String presentOneSingle;
    @JsonProperty
    String presentTwoSingle;
    @JsonProperty
    String presentThreeSingle;
    @JsonProperty
    String presentOnePlural;
    @JsonProperty
    String presentTwoPlural;
    @JsonProperty
    String presentThreePlural;
}
