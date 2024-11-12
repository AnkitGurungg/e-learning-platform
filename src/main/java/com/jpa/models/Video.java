package com.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@PrimaryKeyJoinColumn(name = "video_id") // For JOINT_STRATEGY
//@DiscriminatorValue("V")
@Polymorphism(type = PolymorphismType.EXPLICIT) // Use in TABLE_PER_CLASS to explicit Video table while querying Resource table
public class Video extends Resource {

    private int length;

}
