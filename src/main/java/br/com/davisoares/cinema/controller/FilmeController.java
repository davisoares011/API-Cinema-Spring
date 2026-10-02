package br.com.davisoares.cinema.controller;

import br.com.davisoares.cinema.model.Filme;
import br.com.davisoares.cinema.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Diz que essa classe recebe requisições da internet
@RequestMapping("/filmes") // A URL base será localhost:8080/filmes
public class FilmeController {

    @Autowired
    private FilmeRepository repository; // Injeta o nosso repositório aqui dentro

    // Endpoint para LISTAR todos os filmes (Método GET)
    @GetMapping
    public List<Filme> listarTodos() {
        return repository.findAll();
    }

    // Endpoint para CADASTRAR um novo filme (Método POST)
    @PostMapping
    public Filme salvarNovoFilme(@RequestBody Filme filme) {
        // O @RequestBody pega os dados que o usuário enviou e transforma em um objeto Filme
        return repository.save(filme);
    }
}