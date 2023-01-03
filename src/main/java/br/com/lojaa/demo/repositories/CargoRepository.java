package br.com.lojaa.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lojaa.demo.entities.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    
}
