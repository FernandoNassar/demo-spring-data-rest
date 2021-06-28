package com.demo.springdatarest.api.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "alunos", uniqueConstraints = {@UniqueConstraint(columnNames = {"cpf"})})
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    @Column(name = "data_de_inscricao")
    private LocalDate dataDeInscricao;
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Matricula> matriculas;

    public Aluno(){}

    public Aluno(Long id, String nome, String cpf, String email, LocalDate dataDeInscricao, List<Matricula> matriculas) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataDeInscricao = dataDeInscricao;
        this.matriculas = matriculas;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
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

    public LocalDate getDataDeInscricao() {
        return dataDeInscricao;
    }

    public void setDataDeInscricao(LocalDate dataDeInscricao) {
        this.dataDeInscricao = dataDeInscricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
