package testefuncional_app.meuteste.com.br;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

import PageObjects.PaginaPrincipal;


public class testPaginaPrincipal {
	
	PaginaPrincipal paginaPrincipal;

	@Test
	public void testPaginaAbriu() {
		paginaPrincipal = new PaginaPrincipal();
		
		String conteudoDaPagina = paginaPrincipal.abrirPaginaPrincipal();
		String resultadoEsperado = "Greetings from Spring Boot!";
		assertTrue(conteudoDaPagina.contains(resultadoEsperado));

	}
	
	@After // tearDown()
    public void after() throws Exception {
        System.out.println("Fechando o Browser");
        paginaPrincipal.fechar();
        
	}

}
