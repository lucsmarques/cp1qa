package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClass2 {

	Triangulo tri = new Triangulo();
	@Test
	public void testeequilatero() {
		int Lado1 = 10;
		int Lado2= 10;
		int Lado3 = 10;
		String resultado = tri.calcularLado(Lado1, Lado2, Lado3);
		assertEquals("Equilátero", resultado);		
	}

	@Test
	public void testeisoceles() {
		int Lado4 = 10;
		int Lado5 = 10;
		int Lado6 = 15;
		String resultado = tri.calcularLado(Lado4, Lado5, Lado6);
		assertEquals("Isóceles", resultado);
	}
	
	@Test
	public void testeescaleno() {
		int Lado7 = 15;
		int Lado8 = 5;
		int Lado9 = 10;
		String resultado = tri.calcularLado(Lado7, Lado8, Lado9);
		assertEquals("Escaleno", resultado);
}
}