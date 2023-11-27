package metodos;

import org.openqa.selenium.By;

import conexao.DriversFactory;

public class Metodos extends DriversFactory {

	public void clicar(By elementos) {
		driver.findElement(elementos).click();
	}

	public void escrever(By elementos, String texto) {
		driver.findElement(elementos).sendKeys(texto);
	}
	
	public void apagar(By elementos) {
		driver.findElement(elementos).clear();
	}
	
	
}
