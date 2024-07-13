
package com.example.test.services;

import com.example.test.models.PlanosEmpresaModel;
import com.example.test.repositories.PlanosEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanosEmpresaService {

    @Autowired
    private PlanosEmpresaRepository planosEmpresaRepository;

    public List<PlanosEmpresaModel> findAll() {
        return planosEmpresaRepository.findAll();
    }

    public Optional<PlanosEmpresaModel> findById(Long id) {
        return planosEmpresaRepository.findById(id);
    }

    public PlanosEmpresaModel save(PlanosEmpresaModel planosEmpresa) {
        return planosEmpresaRepository.save(planosEmpresa);
    }

    public void deleteById(Long id) {
        planosEmpresaRepository.deleteById(id);
    }
}
