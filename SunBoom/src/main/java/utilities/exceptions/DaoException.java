package utilities.exceptions;

/**
 * Created by zoetx on 2017/1/22.
 */
import org.springframework.core.NestedRuntimeException;

/**
 * @author
 */
public class DaoException extends NestedRuntimeException {

    private static final long serialVersionUID = 1L;

    public DaoException(String msg) {
        super(msg);
    }

    public DaoException(String msg, Throwable obj) {
        super(msg, obj);
    }
}
