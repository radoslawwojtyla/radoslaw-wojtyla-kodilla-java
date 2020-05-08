package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
//        Logger logger = new Logger();
//        //When
//        logger.log("log1");
//        logger.log("log2");
//        logger.log("log3");
//        String lastLog = logger.getLastLog();
//        //Then
//        Assert.assertEquals("log3", lastLog);

        //Given
        //When
        Logger.getInstance().log("log1");
        Logger.getInstance().log("log2");
        Logger.getInstance().log("log3");
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log3", lastLog);

    }
}
