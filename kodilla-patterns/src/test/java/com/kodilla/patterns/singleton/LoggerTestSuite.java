package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void openFileLog() {
        logger = Logger.INSTANCE;
        logger.log("File with logs has been opened");
    }

    @AfterAll
    public static void closeFileLog() {
        logger.log("File with logs has been closed");
    }

    @Test
    void testGetLastLog() {
        //Given
        logger.log("test log");

        //When & Then
        String log = logger.getLastLog();
        assertEquals("test log", log);
    }
}
