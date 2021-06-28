package com.demo.springdatarest.api.repository;

import com.demo.springdatarest.api.models.Professor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "professores", path = "professores")
public interface ProfessorRepository extends PagingAndSortingRepository<Professor, Long> {

    @RestResource(path = "porCpf", rel = "professor")
    Professor findByCpf(@Param("cpf") String cpf);

    @RestResource(path = "porNome", rel = "professores")
    Page<Professor> findByNomeStartsWith(@Param("nome") String nome, Pageable pageable);

}
