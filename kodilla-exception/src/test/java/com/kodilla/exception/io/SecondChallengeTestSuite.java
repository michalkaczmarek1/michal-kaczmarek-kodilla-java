package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void probablyIWillThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when & then
        assertAll(
            //check boundary value x and y
            () -> assertDoesNotThrow(() -> secondChallenge.propablyIWillThrowException(1.9, 1.6)),
            //check boundary value y
            () -> assertDoesNotThrow(() -> secondChallenge.propablyIWillThrowException(1.2, 1.4)),
            //check boundary value x
            () -> assertDoesNotThrow(() -> secondChallenge.propablyIWillThrowException(1, 2.5)),
            //check boundary value x
            () -> assertDoesNotThrow(() -> secondChallenge.propablyIWillThrowException(1.1, 0.9)),
            //check boundary value x
            () -> assertThrows(Exception.class, () -> secondChallenge.propablyIWillThrowException(0.9, 1.7)),
            //check boundary value x
            () -> assertThrows(Exception.class, () -> secondChallenge.propablyIWillThrowException(2.1, 1.3)),
            //check exception y
            () -> assertThrows(Exception.class, () -> secondChallenge.propablyIWillThrowException(1.8, 1.5)),
            //check exception x
            () -> assertThrows(Exception.class, () -> secondChallenge.propablyIWillThrowException(2, 2.4))
        );
    }

}
