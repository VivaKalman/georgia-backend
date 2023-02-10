package ge.ka.ubani.georgiabackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ServerException extends BaseException {

    public ServerException(final String message) {
        super(message);
    }

    public ServerException(final String message, final List<String> errors) {
        super(message, errors);
    }

    public ServerException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
