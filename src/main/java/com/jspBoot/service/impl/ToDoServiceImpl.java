package com.jspBoot.service.impl;

import com.jspBoot.entity.ToDo;
import com.jspBoot.repository.ToDoRepository;
import com.jspBoot.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoRepository repo;

    @Override
    public List<ToDo> getAllToDoItems() {
        return repo.findAll();
    }

    @Override
    public ToDo getToDoItemById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public boolean saveOrUpdateToDoItem(ToDo toDo) {
        return getToDoItemById(repo.save(toDo).getId()) != null;
    }

    @Override
    public boolean updateStatus(Long id) {
        ToDo toDo=repo.findById(id).get();
        toDo.setStatus("Completed");
        return saveOrUpdateToDoItem(toDo);
    }

    @Override
    public boolean deleteToDoItem(Long id) {
        repo.deleteById(id);
        return repo.findById(id).isEmpty();
    }
}
