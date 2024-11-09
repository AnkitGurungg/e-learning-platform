package com.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int size;

    private String url;

    // When a new lecture or new resource is created, need to link both of them together to have bidirectional relationship (standard bidirectional approach is mappedBy on inverse side)
    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

}
