package ge.ka.ubani.georgiabackend.exception;

import lombok.Getter;

import java.util.List;

/**
 * Base exception with logging support.
 * <p>
 * All inheritors to be handled by {@link BaseException}.
 */
public abstract class BaseException extends RuntimeException {

    @Getter
    private final List<String> errors;

    protected BaseException() {
        this.errors = List.of();
    }

    protected BaseException(final String message) {
        super(message);

        this.errors = List.of();
    }

    protected BaseException(final String message, final List<String> errors) {
        super(message);

        this.errors = errors;
    }

    protected BaseException(final String message, final Throwable cause) {
        super(message, cause);

        this.errors = List.of();
    }

    protected BaseException(final String message, final List<String> errors, final Throwable cause) {
        super(message, cause);

        this.errors = errors;
    }
}
