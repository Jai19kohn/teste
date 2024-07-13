package com.example.test.repositories;

import com.example.test.models.PlanosEmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanosEmpresaRepository extends JpaRepository<PlanosEmpresaModel, Long> {
}