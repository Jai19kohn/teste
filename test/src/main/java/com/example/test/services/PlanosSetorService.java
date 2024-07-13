package com.example.test.services;

import com.example.test.models.PlanosSetorModel;
import com.example.test.repositories.PlanosSetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanosSetorService {

    @Autowired
    private PlanosSetorRepository planosSetorRepository;

    public List<PlanosSetorModel> findAll() {
        return planosSetorRepository.findAll();
    }

    public Optional<PlanosSetorModel> findById(Long id) {
        return planosSetorRepository.findById(id);
    }
}