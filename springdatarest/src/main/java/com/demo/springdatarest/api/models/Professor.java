package com.demo.springdatarest.api.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "professores", uniqueConstraints = {@UniqueConstraint(columnNames = {"cpf"})})
public class Professor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    @Column(name = "data_de_contratacao")
    private LocalDate dataDeContratacao;
    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private List<Curso> cursos = new ArrayList<>();

    public Professor(){}
    public Professor(Long id, String nome, String cpf, String email, LocalDate dataDeContratacao) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataDeContratacao = dataDeContratacao;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(LocalDate dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
