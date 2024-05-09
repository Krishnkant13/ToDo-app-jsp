package com.jspBoot.service;

import com.jspBoot.entity.ToDo;

import java.util.List;

public interface ToDoService {

    //getall
    public List<ToDo> getAllToDoItems();

    //getbyid
    public ToDo getToDoItemById(long id);

    //save and update
    public boolean saveOrUpdateToDoItem(ToDo toDo);

    //updateStatus
    public boolean updateStatus(Long id);

    //delete
    public boolean deleteToDoItem(Long id);

}
