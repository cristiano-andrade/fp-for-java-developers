package io.cristiano.fp.forjavadevelopers.functions.test;

import io.cristiano.fp.forjavadevelopers.functions.Function1Void;
import io.cristiano.fp.forjavadevelopers.functions.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Function1VoidTestCase {

    @Test
    public void should_console_log() {

        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));

        Function1Void<String> function = new Function1Void<String>() {
            @Override
            public void apply(String logger) {
                System.out.println(logger);
            }
        };

        Logger logger = new Logger(function);
        logger.log("Hi!");
        logger.log("Hello World!!!");

        String result = myOut.toString();

        Assert.assertEquals("Hi!\nHello World!!!\n", result);

    }


}
