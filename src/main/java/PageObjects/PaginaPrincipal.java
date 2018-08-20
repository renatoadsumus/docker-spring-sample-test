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
		String diretorioChromeDriver = "/opt/web-driver";
		//String url = "http://jenkins-renato.us-east-1.elasticbeanstalk.com:8080/";
		String url = "https://www.google.com.br/";
		System.setProperty("webdriver.chrome.driver", diretorioChromeDriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);			
		
		
		String conteudoPagina = driver.getPageSource();
		
		System.out.println("Conteudo HTMLo da Pagina..: " + conteudoPagina);	
			
		
		return conteudoPagina;	
		
		
	}
	
	
	
	public static void fechar() {
		driver.quit();
	}

}
