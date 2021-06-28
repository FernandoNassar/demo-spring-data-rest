package com.demo.springdatarest.api.repository;

import com.demo.springdatarest.api.models.Avaliacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "avaliacoes", path = "avaliacoes")
public interface AvaliacaoRepository extends PagingAndSortingRepository<Avaliacao, Long> {

}
