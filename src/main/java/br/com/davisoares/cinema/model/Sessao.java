package br.com.davisoares.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sala;
    private String horario; // Ex: "20:00" ou "15/10/2026 20:00"

    // Aqui acontece a mágica do relacionamento!
    @ManyToOne
    @JoinColumn(name = "filme_id") // Cria uma coluna na tabela para guardar o ID do filme
    private Filme filme;

    public Sessao() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public Filme getFilme() { return filme; }
    public void setFilme(Filme filme) { this.filme = filme; }
}