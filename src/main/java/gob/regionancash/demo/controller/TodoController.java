package gob.regionancash.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.regionancash.demo.model.Todo;
import gob.regionancash.demo.model.Todo.TodoBuilder;

@RestController
@RequestMapping("/todo")
public class TodoController {
    
    @GetMapping()
    public List<Todo> list() {
        List data = new ArrayList<>();
        TodoBuilder builder = Todo.builder().active(true).name("name1");
        data.add(builder.build());
        builder.description("des2");
        data.add(builder.build());
        return data;
    }

}
