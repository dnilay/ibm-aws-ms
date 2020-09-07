package org.example.service;

import org.example.model.ToDo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ToDoServiceImpl {

    private Map<Integer, ToDo> toDoMap;

    public ToDoServiceImpl()
    {
        toDoMap=new HashMap<Integer, ToDo>();
        toDoMap.put(1,new ToDo(UUID.randomUUID().toString(),"Compile",true));
        toDoMap.put(2,new ToDo(UUID.randomUUID().toString(),"Test",true));
        toDoMap.put(3,new ToDo(UUID.randomUUID().toString(),"Deploy",false));
    }

    public Map<Integer,ToDo> getToDoMap()
    {
        return toDoMap;
    }
}
