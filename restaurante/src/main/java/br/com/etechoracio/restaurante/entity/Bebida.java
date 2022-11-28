package br.com.etechoracio.restaurante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.restaurante.enums.Tamanho;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Bebida")
public class Bebida {
	@Enumerated (EnumType.STRING)
	@Column (name = "tam_beb")
	private Tamanho tamBebida;
	@Column (name = "nome_beb")
	private String nomeBebida;
	@Column (name = "valor_beb")
	private Double valorBebida;
	@Id
	@Column (name = "cod_beb")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codBebida;
}
