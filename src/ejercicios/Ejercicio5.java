package ejercicios;
import java.util.Scanner;
public class Ejercicio5 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// lado al cubo 
		System.out.println("Introduce la medida de lado: ");
		double lado = sc.nextDouble();
		double volumen = calcularVolumen(lado);
		verResultado(volumen);
	}
	
	public static double calcularVolumen(double lado) {
		double volumen = lado * lado *lado;
		return volumen;
	}
	
	public static void verResultado(double volumen) {
		System.out.println("El volumen del cubo es: " + volumen);
	}

}
