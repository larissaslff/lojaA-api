package br.com.lojaa.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lojaa.demo.entities.Empregado;
import br.com.lojaa.demo.repositories.EmpregadoRepository;
import br.com.lojaa.demo.repositories.EmpregadoRepositoryPageable;

@RestController
@RequestMapping("/empregados")
public class EmpregadoController {

    @Autowired
    EmpregadoRepository repository;

    @Autowired
    EmpregadoRepositoryPageable pageable;

    @PostMapping
    public void cadastrar(@RequestBody Empregado empregado){
        repository.save(empregado);
    }

    @GetMapping("/buscar/{page}")
    public Iterable<Empregado> buscar(@PathVariable int page){
        Page<Empregado> empregado = pageable.findAll(PageRequest.of(page, 20));
       return empregado;
    }
}
