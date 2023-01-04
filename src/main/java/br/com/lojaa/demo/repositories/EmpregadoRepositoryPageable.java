package br.com.lojaa.demo.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.lojaa.demo.entities.Empregado;

public interface EmpregadoRepositoryPageable extends PagingAndSortingRepository<Empregado, Long> {
    Page<Empregado> findByNome(@Param("name") String nome, Pageable pageable);
}
