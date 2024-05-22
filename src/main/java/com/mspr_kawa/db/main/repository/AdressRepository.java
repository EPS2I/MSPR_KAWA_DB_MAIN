package com.mspr_kawa.db.main.repository;

import com.mspr_kawa.db.main.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdressRepository extends JpaRepository<Adress, UUID> {
}
