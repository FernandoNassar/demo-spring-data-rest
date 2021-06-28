package com.demo.springdatarest.api.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity @Table(name = "matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean aprovado;
    @Column(name = "data_de_inscricao")
    private LocalDate dataDeInscricao = LocalDate.now();
    @ManyToOne(fetch = FetchType.LAZY)
    private Curso curso;
    @ManyToOne(fetch = FetchType.LAZY)
    private Aluno aluno;
    @OneToMany(mappedBy = "matricula", cascade = CascadeType.ALL)
    private List<Avaliacao> avaliacoes = new ArrayList<>();


    public Matricula() {}

    public Matricula(Long id, Boolean aprovado, LocalDate dataDeInscricao, Curso curso, Aluno aluno, List<Avaliacao> avaliacoes) {
        this.id = id;
        this.aprovado = aprovado;
        this.dataDeInscricao = dataDeInscricao;
        this.curso = curso;
        this.aluno = aluno;
        this.avaliacoes = avaliacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public LocalDate getDataDeInscricao() {
        return dataDeInscricao;
    }

    public void setDataDeInscricao(LocalDate dataDeInscricao) {
        this.dataDeInscricao = dataDeInscricao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
