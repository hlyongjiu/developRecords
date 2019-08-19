package com.learn.throwable_exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trance = new StringWriter();
        printStackTrace(new PrintWriter(trance));
        logger.severe(trance.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("caught " + e);
        }
    }
}
