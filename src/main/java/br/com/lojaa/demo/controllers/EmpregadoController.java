package br.com.lojaa.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lojaa.demo.entities.Empregado;
import br.com.lojaa.demo.repositories.EmpregadoRepository;

@RestController
@RequestMapping("/empregados")
public class EmpregadoController {

    @Autowired
    EmpregadoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Empregado empregado){
    repository.save(empregado);
    }
}
