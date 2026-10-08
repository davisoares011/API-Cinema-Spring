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
    private String horario;

    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

    public Sessao() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public Filme getFilme() { return filme; }
    public void setFilme(Filme filme) { this.filme = filme; }
}