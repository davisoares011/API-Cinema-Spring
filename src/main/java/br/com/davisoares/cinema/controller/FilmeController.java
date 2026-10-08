package br.com.davisoares.cinema.controller;

import br.com.davisoares.cinema.model.Filme;
import br.com.davisoares.cinema.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository repository;

    @GetMapping
    public List<Filme> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Filme salvarNovoFilme(@RequestBody @Valid Filme filme) {
        return repository.save(filme);
    }
    @PutMapping("/{id}")
    public Filme atualizarFilme(@PathVariable Long id, @RequestBody @Valid  Filme filmeAtualizado) {
        Filme filmeExistente = repository.findById(id).orElse(null);

        if (filmeExistente != null) {
            filmeExistente.setTitulo(filmeAtualizado.getTitulo());
            filmeExistente.setDuracaoEmMinutos(filmeAtualizado.getDuracaoEmMinutos());
            filmeExistente.setGenero(filmeAtualizado.getGenero());

            return repository.save(filmeExistente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarFilme(@PathVariable Long id) {
        repository.deleteById(id);
    }
}