package gob.regionancash.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {
    
    @GetMapping()
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello222222 %s!", name);
    }

}
