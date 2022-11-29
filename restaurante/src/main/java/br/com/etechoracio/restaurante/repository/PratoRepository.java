package br.com.etechoracio.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.restaurante.entity.Prato;

public interface PratoRepository extends JpaRepository<Prato, Long>{

}
