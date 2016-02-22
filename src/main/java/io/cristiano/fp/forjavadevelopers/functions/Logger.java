package io.cristiano.fp.forjavadevelopers.functions;

public class Logger {

    private Function1Void<String> logger;

    public Logger(Function1Void<String> logger) {
        this.logger = logger;
    }

    public void log(String message) {
        logger.apply(message);
    }
}
