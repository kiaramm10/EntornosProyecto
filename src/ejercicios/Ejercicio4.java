package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	static Scanner entrada = new Scanner(System.in);
	 
    public static void main(String[] args){
	
	System.out.println("Introduce la base: ");
	double base = entradaDouble();
	System.out.println("Introduce la altura: ");
	double altura = entradaDouble();
	
	System.out.println("El área del rectángulo es "+calcularArea(base, altura));

    }
    
    private static double entradaDouble(){
        return entrada.nextDouble();
    }
    
    
    public static double calcularArea(double base, double altura) {
		
		return base * altura;
	}
}
