package ge.ka.ubani.georgiabackend.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDto {
    @Builder.Default
    private Instant timestamp = Instant.now();
    private int code;
    private String type;
    private String message;
    private List<String> errors;
}
