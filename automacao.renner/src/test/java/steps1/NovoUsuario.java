package steps1;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import runner1.ExecutaNovoUsuario;


public class NovoUsuario {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void iniciarTeste() {
		ExecutaNovoUsuario.abrirNavegador();
		
	}

	 @After
	 public void finalizarTeste() {
	 ExecutaNovoUsuario.fecharNavegador();
	 
	 }
	
	
	@Dado("acesso o site")
	public void acessooSite()  {
	
		metodos.clicar(el.login);
		metodos.escrever(el.name, "Vinicius");
		metodos.escrever(el.email1, "vini_769@hotmail.com");
		metodos.clicar(el.signup);
	  
	}

	@Quando("preencher dados")
	public void preencherDados() {

		metodos.clicar(el.sexo);
		metodos.escrever(el.senha1, "12345678");
		metodos.escrever(el.dia, "29");
		metodos.escrever(el.mes, "July");
		metodos.escrever(el.ano, "1997");
		metodos.escrever(el.primeironome, "Vinicius");
		metodos.escrever(el.sobrenome, "Silva");
		metodos.escrever(el.empresa, "Renner");
		metodos.escrever(el.endereco, "Rua Zelia");
		metodos.escrever(el.endereco2, "Rua Zelia");
		metodos.escrever(el.pais, "Israel");
		metodos.escrever(el.estado, "Sao Paulo");
		metodos.escrever(el.cidade, "Osasco");
		metodos.escrever(el.cep, "06140000");
		metodos.escrever(el.telefone, "11982727272");
		
		
		
		
	}

	@Entao("nova conta criada com sucesso")
	public void novaContaCriadaComSucesso() {
		
		metodos.clicar(el.botao);
			

	}

}
