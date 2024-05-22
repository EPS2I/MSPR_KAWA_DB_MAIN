package com.mspr_kawa.db.main.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adress {

    @Id
    @UuidGenerator
    private UUID id;
    private String postalCode;
    private String city;
}
