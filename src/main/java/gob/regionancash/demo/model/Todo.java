package gob.regionancash.demo.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Todo {
 
    private Integer id;

    private String name;

    private String description;

    private LocalDate date;

    private Boolean active;
}
