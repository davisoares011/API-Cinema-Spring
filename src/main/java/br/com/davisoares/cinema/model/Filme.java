package br.com.davisoares.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Isso avisa ao Spring que essa classe vai virar uma tabela no banco de dados
public class Filme {

    @Id // Diz que este é o identificador único (a chave primária)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco gera o ID automaticamente (1, 2, 3...)
    private Long id;

    private String titulo;
    private int duracaoEmMinutos;
    private String genero;

    // Construtor vazio exigido pelo banco de dados
    public Filme() {}

    // Getters e Setters (São os métodos que permitem ler e gravar os dados)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getDuracaoEmMinutos() { return duracaoEmMinutos; }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) { this.duracaoEmMinutos = duracaoEmMinutos; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}