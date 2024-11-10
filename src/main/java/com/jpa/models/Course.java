package com.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Course extends BaseEntity {

    private String name;

    private String description;

    @ManyToMany
    // Joint table for author and courses
    @JoinTable(
            name = "authors_courses",
            joinColumns = {
                    @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    // This owner side is responsible for managing, updating the joint table and maintaining the foreign key values in joint table and can define multiple join columns
    private List<Author> authors;

    // Inverse side - one course (current object) can have many sections (create a list when many comes)
    @OneToMany(
            mappedBy = "course"
    )
    private List<Section> sections;

}
