package org.example;

import org.example.model.ToDo;
import org.example.service.ToDoServiceImpl;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ToDoServiceImpl toDoService;
    static {
        toDoService=new ToDoServiceImpl();
    }

    public static void main( String[] args )
    {
       Map<Integer, ToDo> todos=toDoService.getToDoMap();
       Collection<ToDo> t =todos.values();
       for(ToDo t1:t)
       {
           System.out.println(t1);
       }
    }
}
