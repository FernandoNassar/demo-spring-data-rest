package com.demo.springdatarest.api.models.projections;

import com.demo.springdatarest.api.models.Aluno;
import com.demo.springdatarest.api.models.Matricula;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;
import java.time.LocalDate;

@Projection(name = "alunoProjection", types = {Aluno.class})
public interface AlunoProjection {

    Long getId();
    String getNome();
    String getCpf();
    LocalDate getDataDeInscricao();
    List<Matricula> getMatriculas();

}
