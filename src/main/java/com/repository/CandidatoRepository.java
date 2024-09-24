package com.repository;

import com.model.Candidato;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

    Candidato findByNome(String nome);

    List<Candidato> findAll(); 
    
    long countByVoto(boolean voto);


}