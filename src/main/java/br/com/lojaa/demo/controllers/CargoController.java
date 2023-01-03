package br.com.lojaa.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lojaa.demo.entities.Cargo;
import br.com.lojaa.demo.repositories.CargoRepository;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    CargoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Cargo cargo){
    repository.save(cargo);
    }
}
