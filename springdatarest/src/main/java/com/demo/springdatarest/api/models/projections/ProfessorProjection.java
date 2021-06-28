package com.demo.springdatarest.api.models.projections;

import com.demo.springdatarest.api.models.Curso;
import com.demo.springdatarest.api.models.Professor;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.List;

@Projection(name = "professorProjection", types = {Professor.class})
public interface ProfessorProjection {
    Long getId();
    String getNome();
    String getCpf();
    LocalDate getDataDeContratacao();
    List<Curso> getCursos();
}
