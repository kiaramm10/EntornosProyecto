package ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//2PI* R*H + 2PI * R^2
		System.out.println("Ingresa el radio del cilindro: ");
		double radio = sc.nextDouble();
		System.out.println("Introduce la altura el cilindro: ");
		double altura = sc.nextDouble();
	
		double area = calcularArea(radio, altura);
		verResultado(area);
	}
	public static double calcularArea(double radio, double altura) {
		double area = 2 * 3.14 * radio * altura + 2*3.14 *radio*radio; 
		return area;
	}
	
	public static void verResultado(double area) {
		System.out.println("El área es: " + area);
	}

}
