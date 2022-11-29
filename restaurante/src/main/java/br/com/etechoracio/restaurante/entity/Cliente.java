package br.com.etechoracio.restaurante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Cliente")
public class Cliente {
	@Id
	@Column (name = "cpf_clie")
	private String cpfClie;
	@Column (name = "email_clie")
	private String emailClie;
	@Column (name = "endereco_clie")
	private String enderecoClie;
	@Column (name = "telefone_clie")
	private String telefoneClie;
	@Column (name = "nome_clie")
	private String nomeClie;
}
