import static org.junit.Assert.*;

import org.junit.Test;

public class TestManipuladorDeString {
	@Test
	public void deveManipularFraseRato() {
		String linha = manipulaLinha.contador("O rato roeu a roupa do rei de roma");

		assertEquals("O a do de rei rato roeu roma roupa", linha);
	}
	
	@Test
	public void deveManipularFraseJabuti() {
		String linha = manipulaLinha.contador("Um pequeno jabuti xereta viu dez cegonhas felizes");

		assertEquals("Um viu dez jabuti xereta pequeno felizes cegonhas", linha);
	}
	
	@Test
	public void deveManipularFraseTigre() {
		String linha = manipulaLinha.contador("Um tigre dois tigres tres tigres quatro tigres cinco tigres");

		assertEquals("Um dois tres tigre cinco tigres tigres quatro tigres tigres", linha);
	}
	
	@Test
	public void deveManipularFraseJava() {
		String linha = manipulaLinha.contador("Ordenação de palavras usando java");

		assertEquals("de java usando palavras Ordenação", linha);
	}

}
