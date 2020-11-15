package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueStudentTestSuite {

    @Test
    public void testUpdate() {
        //Given
        QueueStudent michalKaczmarek = new QueueStudent("Michal Kaczmarek");
        QueueStudent janKowalski = new QueueStudent("Jan Kowalski");
        QueueStudent andrzejNowak = new QueueStudent("Andrzej Nowak");
        QueueStudent scottParker = new QueueStudent("Scott Parker");

        Mentor johnSmith = new Mentor("John Smith");
        Mentor andrewScott = new Mentor("Andrew Scott");

        michalKaczmarek.registryObserver(johnSmith);
        janKowalski.registryObserver(johnSmith);
        andrzejNowak.registryObserver(andrewScott);
        scottParker.registryObserver(andrewScott);

        //When
        michalKaczmarek.addTask("test 1");
        michalKaczmarek.addTask("test 2");
        michalKaczmarek.addTask("test 3");
        janKowalski.addTask("test 4");
        janKowalski.addTask("test 5");
        janKowalski.addTask("test 6");
        janKowalski.addTask("test 7");
        andrzejNowak.addTask("test 8");
        andrzejNowak.addTask("test 9");
        scottParker.addTask("test 10");

        //Then
        assertEquals(7, johnSmith.getUpdateCount());
        assertEquals(3, andrewScott.getUpdateCount());
    }

}
