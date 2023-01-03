package br.com.lojaa.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lojaa.demo.entities.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {
    
}
