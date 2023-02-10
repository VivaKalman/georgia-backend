package ge.ka.ubani.georgiabackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends BaseException {

    public BadRequestException(final String message) {
        super(message);
    }

    public BadRequestException(final String message, final List<String> errors) {
        super(message, errors);
    }
}
