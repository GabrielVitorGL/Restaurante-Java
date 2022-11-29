package br.com.etechoracio.restaurante;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.restaurante.entity.Bebida;
import br.com.etechoracio.restaurante.entity.Cliente;
import br.com.etechoracio.restaurante.entity.Funcionario;
import br.com.etechoracio.restaurante.entity.NotaFiscal;
import br.com.etechoracio.restaurante.entity.Pedido;
import br.com.etechoracio.restaurante.entity.Prato;
import br.com.etechoracio.restaurante.enums.Tamanho;
import br.com.etechoracio.restaurante.repository.BebidaRepository;
import br.com.etechoracio.restaurante.repository.ClienteRepository;
import br.com.etechoracio.restaurante.repository.FuncionarioRepository;
import br.com.etechoracio.restaurante.repository.NotaFiscalRepository;
import br.com.etechoracio.restaurante.repository.PedidoRepository;
import br.com.etechoracio.restaurante.repository.PratoRepository;

@SpringBootApplication
public class RestauranteApplication implements CommandLineRunner {

	@Autowired
	private BebidaRepository repoBebida;
	
	@Autowired
	private PratoRepository repoPrato;
	
	@Autowired
	private ClienteRepository repoCliente;
	
	@Autowired
	private FuncionarioRepository repoFuncionario;
	
	@Autowired
	private NotaFiscalRepository repoNotaFiscal;
	
	@Autowired
	private PedidoRepository repoPedido;
	
	public static void main(String[] args) {
		SpringApplication.run(RestauranteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// BEBIDAS
		List <Bebida> bebidas = Arrays.asList(
				Bebida.builder().nomeBebida ("Coca-Cola")
				   .tamBebida (Tamanho.PEQUENO)
				   .valorBebida(3.00)
				   .build(),
				Bebida.builder().nomeBebida ("Coca-Cola")
				   .tamBebida (Tamanho.MEDIO)
				   .valorBebida(5.00)
				   .build(),
				Bebida.builder().nomeBebida ("Coca-Cola")
				   .tamBebida (Tamanho.GRANDE)
				   .valorBebida(8.00)
				   .build(),
				Bebida.builder().nomeBebida ("Guaraná")
				   .tamBebida (Tamanho.PEQUENO)
				   .valorBebida(3.00)
				   .build(),
				Bebida.builder().nomeBebida ("Guaraná")
				   .tamBebida (Tamanho.MEDIO)
				   .valorBebida(5.00)
				   .build(),
				Bebida.builder().nomeBebida ("Guaraná")
				   .tamBebida (Tamanho.GRANDE)
				   .valorBebida(8.00)
				   .build()
		);
		repoBebida.saveAll (bebidas);
		
		// PRATOS
		List <Prato> pratos = Arrays.asList(
				Prato.builder().nomePrato ("Strogonoff")
				   .tamPrato (Tamanho.PEQUENO)
				   .valorPrato(10.00)
				   .build(),
				Prato.builder().nomePrato ("Strogonoff")
				   .tamPrato (Tamanho.MEDIO)
				   .valorPrato(15.00)
				   .build(),
				Prato.builder().nomePrato ("Strogonoff")
				   .tamPrato (Tamanho.GRANDE)
				   .valorPrato(20.00)
				   .build(),
				Prato.builder().nomePrato ("Bife Amilanesa")
				   .tamPrato (Tamanho.PEQUENO)
				   .valorPrato(12.00)
				   .build(),
				Prato.builder().nomePrato ("Bife Amilanesa")
				   .tamPrato (Tamanho.MEDIO)
				   .valorPrato(17.00)
				   .build(),
				Prato.builder().nomePrato ("Bife Amilanesa")
				   .tamPrato (Tamanho.GRANDE)
				   .valorPrato(22.00)
				   .build()
		);
		repoPrato.saveAll (pratos);
		
		// FUNCIONARIOS
		List <Funcionario> funcionarios = Arrays.asList(
				Funcionario.builder().cpfFun ("12345678911")
				   .nomeFun ("Valdeci")
				   .enderecoFun("Casa do Valdeci")
				   .emailFun("valdeci@hotmail.com")
				   .telefoneFun("11977489424")
				   .salarioFun(12000.00)
				   .build(),
				Funcionario.builder().cpfFun ("09876543286")
				   .nomeFun ("José")
				   .enderecoFun("Avenida Paulo César")
				   .emailFun("jose@hotmail.com")
				   .telefoneFun("1183463814")
				   .salarioFun(2000.00)
				   .build(),
				Funcionario.builder().cpfFun ("76496482746")
				   .nomeFun ("Carlos Gomes")
				   .enderecoFun("Rua eliseu geraldo")
				   .emailFun("carlosgomes@hotmail.com")
				   .telefoneFun("1192655434")
				   .salarioFun(5000.00)
				   .build()
		);
		repoFuncionario.saveAll (funcionarios);
		
		// CRIANDO CLIENTE
		Cliente cliente = Cliente.builder()
						.cpfClie("46723468902")
						.nomeClie("Cleiton")
						.emailClie("cleiton@gmail.com")
						.enderecoClie("Rua das flores")
						.telefoneClie("1184561244")
						.build();
		repoCliente.save (cliente);
		
		// CRIANDO PEDIDO
		Pedido pedido = Pedido.builder().cliente(cliente)
				.funcionario(funcionarios.get(0))
				.bebida(bebidas.get(0))
				.prato(pratos.get(0))
				.dtPed(LocalDateTime.now())
		 .build();
		repoPedido.save (pedido);
		
		// CRIANDO NOTA FISCAL
		NotaFiscal notaFiscal = NotaFiscal.builder().valorTotal(pedido.ObterValorTotal())
				.formaPag("Dinheiro")
				.cliente(pedido.getCliente())
				.pedido(pedido)
				.dtEmi(LocalDateTime.now())
		 .build();
		repoNotaFiscal.save (notaFiscal);
		
	}

}
