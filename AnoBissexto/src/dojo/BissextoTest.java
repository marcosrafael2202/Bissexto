package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BissextoTest {

	@Test
	public void test1600EhPrimo() {
		boolean resposta = Bissexto.definePrimo(1600);
		assertEquals(true, resposta); 
	}
	@Test
	public void test1742EhPrimo() {
		boolean resposta = Bissexto.definePrimo(1742);
		assertEquals(false, resposta); 
	} 
	@Test
	public void test1732EhPrimo() {
		boolean resposta = Bissexto.definePrimo(1732);
		assertEquals(true, resposta); 
	}
	@Test
	public void test1889EhPrimo() {
		boolean resposta = Bissexto.definePrimo(1889);
		assertEquals(false, resposta); 
	}
	@Test
	public void test1888EhPrimo() {
		boolean resposta = Bissexto.definePrimo(1888);
		assertEquals(true, resposta); 
	}
	@Test
	public void test1951EhPrimo() {
		boolean resposta = Bissexto.definePrimo(1951);
		assertEquals(false, resposta); 
	}
	@Test
	public void test1944EhPrimo() {
		boolean resposta = Bissexto.definePrimo(1944); 
		assertEquals(true, resposta); 
	}
	@Test
	public void test2011EhPrimo() {
		boolean resposta = Bissexto.definePrimo(2011);
		assertEquals(false, resposta); 
	}
	@Test
	public void test2008EhPrimo() {
		boolean resposta = Bissexto.definePrimo(2008); 
		assertEquals(true, resposta); 
	}
}
