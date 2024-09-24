package com.model;

import jakarta.persistence.Entity; 
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Candidato {
  
    public Candidato( boolean voto, String nome) {
        this.voto = voto;
        this.nome = nome;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    private Long id;

    @Column(name = "voto" )
    private boolean voto;

    @Column(name = "nome", nullable = false, length = 100) 
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
