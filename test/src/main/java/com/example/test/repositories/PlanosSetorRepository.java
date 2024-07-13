package com.example.test.repositories;

import com.example.test.models.PlanosSetorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanosSetorRepository extends JpaRepository<PlanosSetorModel, Long> {
}