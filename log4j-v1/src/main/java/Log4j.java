import org.apache.log4j.Logger;

/**
 * @author TonyFeng
 */
public class Log4j {
    private static final Logger LOGGER = Logger.getLogger(Log4j.class);

    public static void main(String[] args) {
        LOGGER.debug("debug");
        LOGGER.info("info");
        LOGGER.warn("warn");
        LOGGER.error("error");
    }
}
