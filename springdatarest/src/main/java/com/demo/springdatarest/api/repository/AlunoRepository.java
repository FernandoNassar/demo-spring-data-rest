package com.demo.springdatarest.api.repository;

import com.demo.springdatarest.api.models.Aluno;
import com.demo.springdatarest.api.models.Avaliacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "alunos", path = "alunos")
public interface AlunoRepository extends PagingAndSortingRepository<Aluno, Long> {

    @RestResource(path = "porCpf", rel = "aluno")
    Aluno findByCpf(@Param("cpf") String cpf);

    @RestResource(path = "porNome", rel = "porNome")
    Page<Aluno> findByNomeContaining(@Param("nome") String nome, Pageable p);

    @RestResource(path = "porAlunoID", rel = "avaliacoes")
    @Query(value = "SELECT a FROM Avaliacao a WHERE a.matricula.aluno.id = :alunoId")
    Page<Avaliacao> findAvaliacoesPorId(@Param("alunoId") Long alunoId, Pageable p);

    @RestResource(path = "porCpfAluno", rel = "avaliacoes")
    @Query(value = "SELECT a FROM Avaliacao a WHERE a.matricula.aluno.cpf = :cpf")
    Page<Avaliacao> findAvaliacoesPorCpf(@Param("cpf") String cpf, Pageable p);

}
