package gob.regionancash.demo.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gob.regionancash.demo.model.Todo;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/hello")
public class DemoController {
    
    @GetMapping()
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello222222 %s!", name);
    }

    @PostMapping()
    public Todo post(@RequestBody Todo todo) {
        String description = todo.getDescription();
        if (description==null) {
            description = "initial description ";   
        }
        description = new StringBuilder(description).reverse().toString();
        todo.setDescription("description changed to "+ description);
        todo.setDate(LocalDate.now());
      return todo;
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable String id) {
        System.out.println("deleting "+id);
      return id+ " deleted";
    }

    @PutMapping()
    public String put(Todo todo) {
      return "call put for "+todo;
    }


}
