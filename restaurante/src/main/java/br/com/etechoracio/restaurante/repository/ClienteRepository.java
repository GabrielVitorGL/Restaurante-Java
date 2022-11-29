package br.com.etechoracio.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.restaurante.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
