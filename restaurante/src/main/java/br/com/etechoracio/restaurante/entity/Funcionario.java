package br.com.etechoracio.restaurante.entity;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Funcionario")
public class Funcionario{
    @Column (name = "endereco_fun")
    private String enderecoFun;
    @Column (name = "email_fun")
    private String emailFun;
    @Column (name = "nome_fun")
    private String nomeFun;
    @Id
    @Column (name = "cpf_fun")
    private String cpfFun;
    @Column (name = "telefone_fun")
    private String telefoneFun;
    @Column (name = "salario_fun")
    private BigDecimal salarioFun;
}
