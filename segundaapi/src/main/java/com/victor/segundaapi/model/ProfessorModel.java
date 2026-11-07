package com.victor.segundaapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "professor")
public class ProfessorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfessor;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private String email;


    public ProfessorModel(){

    }


    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
