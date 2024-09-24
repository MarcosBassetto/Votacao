package com.vatacao.votacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.model.Candidato;
import com.repository.CandidatoRepository;

@SpringBootApplication
public class VotacaoApplication {


	public static void main(String[] args) {
		SpringApplication.run(VotacaoApplication.class, args);
	}

}
