package com.demo.springdatarest.api.models.projections;

import java.util.List;
import com.demo.springdatarest.api.models.Curso;
import com.demo.springdatarest.api.models.Unidade;
import org.springframework.data.rest.core.config.Projection;

//http://localhost:8080/unidades/1?projection=unidadeProjection
@Projection(name = "unidadeProjection", types = {Unidade.class})
public interface UnidadeProjection {
    Long getId();
    String getNome();
    String getEndereco();
    String getCep();
    String getBairro();
    List<Curso> getCursos();
}
