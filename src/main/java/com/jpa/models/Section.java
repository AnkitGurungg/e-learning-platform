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
public class Section {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int sectionOrder;

    // Owner side - many sections belong to one course and when many-to-one is used, specify join column
    @ManyToOne
    @JoinColumn(
            name = "course_id"
    )
    private Course course;

}
