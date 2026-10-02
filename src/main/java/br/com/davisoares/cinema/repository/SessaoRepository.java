package br.com.davisoares.cinema.repository;

import br.com.davisoares.cinema.model.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessaoRepository extends JpaRepository <Sessao, Long> {
}