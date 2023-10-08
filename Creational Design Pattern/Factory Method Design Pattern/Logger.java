import logger.*;
public class Logger {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new DebugLoggerFactory();
        ILogger logger = loggerFactory.createLogger();

        logger.log("This is an debug log message");
    }
}
