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
    private double salarioFun;
}
