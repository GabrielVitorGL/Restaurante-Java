package br.com.etechoracio.restaurante.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "NotaFiscal")
public class NotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "cod")
	private int cod;
    @Column (name = "valortotal")
	private Double valorTotal;
    @Column (name = "forma_pag")
	private String formaPag;
    @Column (name = "dt_emi")
	private Date dtEmi;
    @JoinColumn(name = "num_ped")
	@OneToOne
    private Pedido pedido;
    @JoinColumn(name = "cpf_clie")
    @ManyToOne
    private Cliente cliente;
}
