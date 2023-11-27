package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import runner.ExecutaRealizarCompra;


public class RealizarCompra {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void iniciarTeste() {
		ExecutaRealizarCompra.abrirNavegador();
		
	}

	@After
	public void finalizarTeste() {
	 ExecutaRealizarCompra.fecharNavegador();
	 
	}
	
	
	@Dado("realizar login")
	public void realizarLogin()  {
	
		metodos.clicar(el.login);
		metodos.escrever(el.email, "vini_769@hotmail.com");
		metodos.escrever(el.senha, "12345678");
		metodos.clicar(el.button);
	  
	}

	@Quando("selecionar os produtos")
	public void selecionarOsProdutos() {

		metodos.clicar(el.stylish);
		metodos.apagar(el.quantidade);
		metodos.escrever(el.quantidade, "3");
		metodos.clicar(el.select);
		metodos.clicar(el.continuar);
		metodos.clicar(el.produtos);
		metodos.clicar(el.beautiful);
		metodos.apagar(el.quantidadebeautiful);
		metodos.escrever(el.quantidadebeautiful, "2");
		metodos.clicar(el.selectbeautiful);
		metodos.clicar(el.continuarbeautiful);
		metodos.clicar(el.produtos1);
		metodos.clicar(el.mentshirt);
		metodos.clicar(el.selectmentshirt);
		metodos.clicar(el.continuarmentshirt);
		metodos.clicar(el.vercarrinho);
		
		
	}

	@Entao("realizar pagamento com sucesso")
	public void realizarPagamentoComSucesso() {
		
		metodos.clicar(el.fazercheckout);
		metodos.escrever(el.comentarios, "Estou muito feliz com a compra.");
		metodos.clicar(el.fazerpedido);
		metodos.escrever(el.nomecartao, "Vinicius Silva");
		metodos.escrever(el.numerocartao, "123456789100");
		metodos.escrever(el.cvccartao, "123");
		metodos.escrever(el.expiretion, "07");
		metodos.escrever(el.anocartao, "2030");
		metodos.clicar(el.confirmarpg);
		metodos.clicar(el.deleteconta);
		
		
		
		

	}

}
