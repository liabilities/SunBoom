package utilities.exceptions;

/**
 * Created by zoetx on 2017/1/22.
 */
import org.springframework.core.NestedRuntimeException;

public class SessionTimeoutException extends NestedRuntimeException {
    private static final long serialVersionUID = 1L;

    public SessionTimeoutException(String msg) {
        super(msg);
    }

    public SessionTimeoutException(String msg, Throwable obj) {
        super(msg, obj);
    }

}

