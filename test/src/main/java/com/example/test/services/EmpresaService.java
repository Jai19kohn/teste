package com.example.test.services;

import com.example.test.models.EmpresaModel;
import com.example.test.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<EmpresaModel> findAll() {
        return empresaRepository.findAll();
    }

    public Optional<EmpresaModel> findById(Long id) {
        return empresaRepository.findById(id);
    }

    public EmpresaModel save(EmpresaModel empresa) {
        return empresaRepository.save(empresa);
    }

    public void deleteById(Long id) {
        empresaRepository.deleteById(id);
    }
}
