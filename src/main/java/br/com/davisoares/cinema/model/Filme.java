package br.com.davisoares.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @jakarta.validation.constraints.NotBlank(message = "O título do filme é obrigatório")
    private String titulo;

    @jakarta.validation.constraints.Positive(message = "A duração deve ser maior que zero")
    private int duracaoEmMinutos;

    @jakarta.validation.constraints.NotBlank(message = "O género do filme é obrigatório")

    private String genero;
    public Filme() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getDuracaoEmMinutos() { return duracaoEmMinutos; }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) { this.duracaoEmMinutos = duracaoEmMinutos; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}