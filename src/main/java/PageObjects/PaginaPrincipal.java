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
		String 	diretorioChromeDriver = "/opt/web-driver/chromedriver";
		//String diretorioChromeDriver = "C:\\web-drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", diretorioChromeDriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url ="http://jenkins-renato.us-east-1.elasticbeanstalk.com:8080/";

		System.out.println("Abrindo a Pagina..:  " + url);	

		driver.get(url);			
		
		String conteudoPagina = driver.getPageSource();
		
		System.out.println("Conteudo HTMLo da Pagina..: " + conteudoPagina);	
			
		
		return conteudoPagina;
		
		
		
	}
	
	
	
	public static void fechar() {
		driver.quit();
	}

}
