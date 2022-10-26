package br.com.alura.forun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forun.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
    

}
