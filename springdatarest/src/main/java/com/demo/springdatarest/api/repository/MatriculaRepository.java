package com.demo.springdatarest.api.repository;

import com.demo.springdatarest.api.models.Matricula;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "matriculas", path = "matriculas")
public interface MatriculaRepository extends PagingAndSortingRepository<Matricula, Long> {
}
