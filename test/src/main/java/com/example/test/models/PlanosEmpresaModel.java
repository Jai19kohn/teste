package com.example.test.models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "planos_estrategicos_empresa")
public class PlanosEmpresaModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_empresa")
    private Long id_empresa;

    @Column
    private String horizonte;

    @Column
    private String descricao;

    public PlanosEmpresaModel() {
    }

    //GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public String getHorizonte() {
        return horizonte;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public void setHorizonte(String horizonte) {
        this.horizonte = horizonte;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}