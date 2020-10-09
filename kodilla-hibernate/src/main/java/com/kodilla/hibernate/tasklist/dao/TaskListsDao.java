package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskListsDao extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);

    List<TaskList> findByDescription(String description);
}