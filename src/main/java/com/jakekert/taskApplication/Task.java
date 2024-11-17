package com.jakekert.taskApplication;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
public class Task {

    @Id
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String task;
    @Getter
    @Setter
    private String description;

    // Constructors, getters, setters, etc.
}
