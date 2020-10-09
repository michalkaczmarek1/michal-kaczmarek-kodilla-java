package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListsDaoTestSuite {
    private static final String DESCRIPTION = "Test description tasklist";



    @Autowired
    private TaskListsDao taskListsDao;

    @Test
    void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList("In progress", DESCRIPTION);

        //When
        taskListsDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListsDao.findById(id);
        assertTrue(readTask.isPresent());

        //clean up
        taskListsDao.deleteAll();
    }

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("To Do", DESCRIPTION);
        taskListsDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListsDao.findByListName(listName);


        //Then
        assertEquals(1, readTaskLists.size());

        // clean up
        int id = readTaskLists.get(0).getId();
        taskListsDao.deleteAll();

    }

    @Test
    void testFindByDescription() {
        //Given
        TaskList taskList = new TaskList("Done", DESCRIPTION);
        taskListsDao.save(taskList);

        //When
        List<TaskList> taskListsDesc = taskListsDao.findByDescription(DESCRIPTION);

        //Then
        assertEquals(1, taskListsDesc.size());

        //clean up
        int id = taskListsDesc.get(0).getId();
        taskListsDao.deleteAll();
    }

    @Test
    void testFindAll() {
        //Given
        TaskList taskList1 = new TaskList("To do", DESCRIPTION);
        TaskList taskList2 = new TaskList("In progress", DESCRIPTION);
        taskListsDao.save(taskList1);
        taskListsDao.save(taskList2);

        //When
        Iterable<TaskList> readTasks = taskListsDao.findAll();
        List<TaskList> tasksLists = new ArrayList<>();
        for(TaskList taskList: readTasks) {
            tasksLists.add(taskList);
        }

        //Then
        assertEquals(2, tasksLists.size());

        //clean up
        int id1 = tasksLists.get(0).getId();
        int id2 = tasksLists.get(1).getId();
        taskListsDao.deleteAll();
    }

}
