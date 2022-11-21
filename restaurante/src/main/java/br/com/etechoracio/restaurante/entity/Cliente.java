package br.com.etechoracio.restaurante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Cliente")
public class Cliente {
	@Id
	@Column (name = "cpf_clie")
	private int cpfClie;
	@Column (name = "email_clie")
	private String emailClie;
	@Column (name = "endereco_clie")
	private String enderecoClie;
	@Column (name = "telefone_clie")
	private int telefoneClie;
	@Column (name = "nome_clie")
	private String nomeClie;
}
