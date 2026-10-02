package br.com.davisoares.cinema.controller;

import br.com.davisoares.cinema.model.Sessao;
import br.com.davisoares.cinema.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessoes") // A URL será http://localhost:8080/sessoes
public class SessaoController {

    @Autowired
    private SessaoRepository repository;

    @GetMapping
    public List listarTodas() {
        return repository.findAll();
    }

    @PostMapping
    public Sessao criarSessao(@RequestBody Sessao sessao) {
        return repository.save(sessao);
    }
}