package ge.ka.ubani.georgiabackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.UUID;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends BaseException {


    public NotFoundException(final String message) {
        super(message);
    }

    public NotFoundException(final String message, final List<String> errors) {
        super(message, errors);
    }

    public static NotFoundException notFoundById(String entityType, UUID id) {
        return new NotFoundException("Entity [type = %s] not found. id = %s".formatted(entityType, id));
    }
}
