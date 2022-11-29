package br.com.etechoracio.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.restaurante.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String>{

}
