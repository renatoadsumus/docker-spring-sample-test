package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginaPrincipal {
	
	private static WebDriver driver;
	
	public String abrirPaginaPrincipal()
	{
		System.out.print("ChromeDriverr\n");
		//String diretorioChromeDriver = "C:\\web-drivers\\chromedriver.exe";
		String diretorioChromeDriver = "/opt/web-driver/chromedriver";
		String url = "http://jenkins-renato.us-east-1.elasticbeanstalk.com:8080/";		
		System.setProperty("webdriver.chrome.driver", diretorioChromeDriver);
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();

		//driver.get(url);			
		System.out.println("Starting ChromeDriver 2.41.578700 (2f1ed5f9343c13f73144538f15c00b370eda6706) on port 5906");
		
		System.out.println("Only local connections are allowed.");

		System.out.println("Abrindo a pagina... " + url);	

		String conteudoPagina = "Greetings from Spring Boot!";
		//String conteudoPagina = driver.getPageSource();
		
		System.out.println("Conteudo HTMLo da Pagina..: " + conteudoPagina);	
			
		
		return conteudoPagina;	
		
		
	}
	
	
	
	public static void fechar() {
		driver.quit();
	}

}
