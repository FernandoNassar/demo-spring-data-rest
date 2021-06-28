package com.demo.springdatarest.api.models.projections;

import com.demo.springdatarest.api.models.Curso;
import com.demo.springdatarest.api.models.Matricula;
import com.demo.springdatarest.api.models.Professor;
import com.demo.springdatarest.api.models.Unidade;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;
import java.time.LocalDate;

@Projection(name = "cursoProjection", types = {Curso.class})
public interface CursoProjection {

    Long getId();
    String getNome();
    LocalDate getDataInicio();
    LocalDate getDataFim();
    Boolean getFinalizado();
    Unidade getUnidade();
    Professor getProfessor();
    List<Matricula> getMatriculas();

}
