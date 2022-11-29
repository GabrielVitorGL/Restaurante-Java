package br.com.etechoracio.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.restaurante.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
