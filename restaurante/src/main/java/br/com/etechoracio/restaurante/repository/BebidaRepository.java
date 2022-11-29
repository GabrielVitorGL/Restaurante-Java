package br.com.etechoracio.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.restaurante.entity.Bebida;

public interface BebidaRepository extends JpaRepository<Bebida, Long>{
	
}
