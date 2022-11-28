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
@Table(name = "Prato")
public class Prato {
	@Enumerated (EnumType.STRING)
	@Column (name = "tam_prato")
	private Tamanho tamPrato;
	@Column (name = "nome_prato")
	private String nomePrato;
	@Column (name = "valor_prato")
	private Double valorPrato;
	@Id
	@Column (name = "cod_prato")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codPrato;
}
