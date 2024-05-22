package com.mspr_kawa.db.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Details {

    @Id
    @UuidGenerator
    private UUID id;
    private float price;
    private String description;
    private String color;
}
