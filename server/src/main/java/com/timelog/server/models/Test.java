package com.timelog.server.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
public class Test {
    @Id
    @Getter
    @Setter
    Long id;

    @Getter
    @Setter
    String val;

    public Test() {
        id = 1L;
        val = "test";
    }
}
