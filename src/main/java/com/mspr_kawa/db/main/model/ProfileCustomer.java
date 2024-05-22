package com.mspr_kawa.db.main.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@Embeddable
//@NoArgsConstructor
//@AllArgsConstructor
public class ProfileCustomer {

    @Id
    @UuidGenerator
    private UUID id;
    @Transient
    private String firstName;
    @Transient
    private String lastName;
}
