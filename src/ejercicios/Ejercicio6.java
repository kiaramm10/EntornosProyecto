package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println("Introduce la altura de la arista: ");
		double arista = entradaDouble();
		calcAreaCubo(arista);
		
	}
	
	private static double entradaDouble(){
        return entrada.nextDouble();
    }
	
	private static double calcAreaCubo(double arista) {
		
		return 6 * Math.pow(arista, 2);
		
	}

}
