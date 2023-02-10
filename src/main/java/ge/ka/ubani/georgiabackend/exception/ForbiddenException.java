package ge.ka.ubani.georgiabackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class ForbiddenException extends BaseException {

    public ForbiddenException(final String message, final List<String> errors) {
        super(message, errors);
    }
}
