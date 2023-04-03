package calculadora;

public class Triangulo {

	public String calcularLado(int lado1, int lado2, int lado3) {
		if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triangulo e equilatero.");
            	return "equilatero";
	}
		
		return "Não é equilatero";
	}
	public String calcularLado1(int lado4, int lado5, int lado6) {
		if (lado4 == lado5 && lado5 && lado4 != lado6) {
	          System.out.println("O triangulo e isoceles.");
	              return "isoceles";
	}
			
			return "Não é isoceles";
	}
		public String calcularLado2(int lado7, int lado8, int lado9) {
			if (lado7 != lado8 && lado8 && lado7 != lado9) {
			     System.out.println("O triangulo e escaleno.");
			         return "escaleno";
				}
					
					return "Não é escaleno";
	}

}
