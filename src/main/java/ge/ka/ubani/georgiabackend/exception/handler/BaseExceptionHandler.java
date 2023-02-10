package ge.ka.ubani.georgiabackend.exception.handler;

import ge.ka.ubani.georgiabackend.exception.BaseException;
import ge.ka.ubani.georgiabackend.exception.dto.ExceptionDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Global Spring MVC exception handler that handles {@link BaseException} and returns {@link  ExceptionDto}.
 */
@Slf4j
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = {BaseException.class})
    ResponseEntity<ExceptionDto> handleLoggingSupportException(final BaseException ex) {
        log.error("Something went wrong. message = {}, errors = {}", ex.getMessage(), ex.getErrors());
        if (log.isTraceEnabled()) {
            ex.printStackTrace();
        }
        final var status = getHttpStatus(ex);
        return ResponseEntity
            .status(status)
            .body(
                ExceptionDto.builder()
                    .code(status.value())
                    .type(ex.getClass().getCanonicalName())
                    .message(ex.getMessage())
                    .errors(ex.getErrors())
                    .build()
            );
    }

    private static HttpStatus getHttpStatus(final RuntimeException ex) {
        return getStatus(ex.getClass());
    }

    private static HttpStatus getStatus(final Class<?> type) {
        if (type == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        final var annotation = type.getAnnotation(ResponseStatus.class);
        if (annotation != null) {
            return annotation.value();
        }
        return getStatus(type.getSuperclass());
    }
}
