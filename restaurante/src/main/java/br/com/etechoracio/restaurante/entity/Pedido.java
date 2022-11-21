package br.com.etechoracio.restaurante.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Pedido")
public class Pedido {
	@Column (name = "dt_ped")
	private Date dtPed;
	@Column (name = "horario_ped")
	private String horarioPed;
	@Id
	@Column (name = "num_ped")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numPed;
	@JoinColumn (name = "cpf_clie")
    @ManyToOne
	private int cpfClie;
	@JoinColumn (name = "cod_beb")
    @ManyToOne
	private int codBebida;
	@JoinColumn (name = "cod_prato")
    @ManyToOne
	private int codPrato;
    @JoinColumn (name = "cpfFun")
    @ManyToOne
    private String cpfFun;
}
