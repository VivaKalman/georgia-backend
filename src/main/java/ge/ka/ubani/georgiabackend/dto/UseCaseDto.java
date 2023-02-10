package ge.ka.ubani.georgiabackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
@JsonDeserialize(builder = UseCaseDto.UseCaseDtoBuilder.class)
@EqualsAndHashCode(of = "id")
public class UseCaseDto {
    @JsonProperty
    UUID id;
    @JsonProperty
    String origin;
    @JsonProperty
    String translate;
    @JsonProperty
    UUID rootWordId;
}
