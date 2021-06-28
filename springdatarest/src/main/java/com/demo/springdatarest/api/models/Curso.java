package com.demo.springdatarest.api.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity @Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "data_inicio")
    private LocalDate dataInicio;
    @Column(name = "data_fim")
    private LocalDate dataFim;
    private Boolean finalizado;
    @ManyToOne
    private Unidade unidade;
    @ManyToOne
    private Professor professor;
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Matricula> matriculas;

    public Curso(){}


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
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    public Boolean getFinalizado() {
        return finalizado;
    }
    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
