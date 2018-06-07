import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptions2 {

    static Logger logger = Logger.getLogger("LoggingExceptions2");

    public static void loggingException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(e.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        }
        catch (NullPointerException e) {
            loggingException(e);
        }
    }
}
