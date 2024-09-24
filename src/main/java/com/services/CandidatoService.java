package com.services;

import com.model.Candidato;
import com.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoService {

    @Autowired
    private  CandidatoRepository candidatoRepository;

    public List<Candidato> buscarTodosOsCandidatos() {
        return candidatoRepository.findAll();
    }
}