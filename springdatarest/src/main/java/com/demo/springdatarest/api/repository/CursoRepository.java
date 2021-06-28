package com.demo.springdatarest.api.repository;

import com.demo.springdatarest.api.models.Curso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "cursos", path = "cursos")
public interface CursoRepository extends PagingAndSortingRepository<Curso, Long> {

    @RestResource(path = "porNome", rel = "porNome")
    public Page<Curso> findByNomeContaining(@Param("nome") String nome, Pageable p);

}
