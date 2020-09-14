package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        List<String> tasksToDo = board.getToDoList().getTasks();
        List<String> tasksInProgress = board.getInProgressList().getTasks();
        List<String> tasksDone = board.getDoneList().getTasks();
        tasksToDo.add("task 1 to do");
        tasksInProgress.add("task 1 progress");
        tasksDone.add("task 1 done");

        //Then
        assertEquals("task 1 to do", tasksToDo.get(0));
        assertEquals("task 1 progress", tasksInProgress.get(0));
        assertEquals("task 1 done", tasksDone.get(0));
    }
}
