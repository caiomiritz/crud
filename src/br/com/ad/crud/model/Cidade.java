package br.com.ad.crud.model;

import java.util.UUID;

public class Cidade {

    private UUID id;
    private String nome;
    private String estado;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public UUID getId(){
        return id;
    }

    public void setId(UUID id){
        this.id = id;
    }
}
