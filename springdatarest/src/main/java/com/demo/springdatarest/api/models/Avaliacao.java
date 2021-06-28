package com.demo.springdatarest.api.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity @Table(name = "avaliacoes")
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING) @Column(name = "tipo_de_avaliacao")
    private TipoDeAvaliacao tipoDeAvaliacao;
    private Double nota;
    private LocalDate data;
    @ManyToOne(fetch = FetchType.LAZY)
    private Matricula matricula;

    public Avaliacao(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoDeAvaliacao getTipoDeAvaliacao() {
        return tipoDeAvaliacao;
    }

    public void setTipoDeAvaliacao(TipoDeAvaliacao tipoDeAvaliacao) {
        this.tipoDeAvaliacao = tipoDeAvaliacao;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
