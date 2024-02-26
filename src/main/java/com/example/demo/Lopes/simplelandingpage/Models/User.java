package com.example.demo.Lopes.simplelandingpage.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String nome;


    private String email;

    private String mensagem;

    private String situacao;



    public String getMensagem(){
        return this.mensagem;
    }

    public String getSituacao(){
        return this.situacao;
    }

    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public void setSituacao(String situacao){
        this.situacao = situacao;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    
    
}