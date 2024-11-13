package com.jpa.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderId implements Serializable {

//    OrderId an entity but not a persistent entity something like composition(super class) where multiple attributes can be composed and later on it can be used as an embedded id

    private String username;

    private LocalDateTime orderDate;

}
