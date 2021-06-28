package com.demo.springdatarest.api.repository;

import com.demo.springdatarest.api.models.Unidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "unidades", path = "unidades")
public interface UnidadeRepository extends PagingAndSortingRepository<Unidade, Long> {
    // ?page=0&size=10&sort=id,desc
    //http://localhost:8080/api/professores/search/porNome?nome=xxxxx

    @RestResource(rel = "unidades", path = "porNome")
    Page<Unidade> findByNomeContaining(@Param("nome") String nome, Pageable pageable);

    @RestResource(rel = "unidades", path = "porBairro")
    Page<Unidade> findByBairro(@Param("bairro") String bairro, Pageable pageable);

    @RestResource(rel = "unidades", path = "porCep")
    Page<Unidade> findByCep(@Param("cep") String cep, Pageable pageable);
}
