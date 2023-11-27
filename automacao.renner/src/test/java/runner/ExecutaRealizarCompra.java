package runner;

import java.time.Duration;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import conexao.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@RealizarCompra", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/cucumber-report.html" }, snippets = SnippetType.CAMELCASE

)
public class ExecutaRealizarCompra extends DriversFactory {

	public static void abrirNavegador() {
		
		String url = "https://automationexercise.com/";
		String navegador = "Chrome";

		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-application-cache");

		} else if (navegador.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		} else {
			System.out.println("Digite Chrome ou Firefox");
		}

		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void fecharNavegador() {
		driver.quit();
	}

}
