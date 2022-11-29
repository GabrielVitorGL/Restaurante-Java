package br.com.etechoracio.restaurante.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "Pedido")
public class Pedido {
	@Column (name = "dt_ped")
	private LocalDateTime dtPed;
	@Id
	@Column (name = "num_ped")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numPed;
	@JoinColumn(name = "cpf_clie")
	@ManyToOne
	private Cliente cliente;
	@JoinColumn(name = "cod_prato")
	@ManyToOne
	private Prato prato;
	@JoinColumn(name = "cod_beb")
	@ManyToOne
	private Bebida bebida;
	@JoinColumn(name = "cpf_fun")
	@ManyToOne
    private Funcionario funcionario;
	
	public double ObterValorTotal () {
	    return (prato.getValorPrato() + bebida.getValorBebida());
	}
}
