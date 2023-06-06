import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjercicioOperaciones {
	
	// Declara las constantes de clase SUMA y RESTA
	
	public static final int SUMA = 1;
	public static final int RESTA = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Crea un objeto Scanner
        
		Scanner entrada=new Scanner(System.in);
		
        // Pide al usuario que ingrese dos números enteros y almacénalos en las variables num1 y num2
		System.out.print("ingresa el primer numero: ");
		int num1=entrada.nextInt();
		
		System.out.print("ingresa el segundo numero: ");
		int num2=entrada.nextInt();
		
        // Calcula la suma de los dos números y muéstrala al usuario
		
		int suma = calcularOperacion(num1, num2, SUMA);
		System.out.println("La suma de los dos numeros es: " + suma);
        
        // Calcula la resta de los dos números y muéstrala al usuario
		
		int resta = calcularOperacion(num1, num2, RESTA);
		System.out.println("La resta de los dos numeros es " + resta);
        
        // Calcula el producto de los dos números y muéstrala al usuario
		
		int producto = num1*num2;
		System.out.println("el producto de los dos numeros es: " + producto);
        
        // Calcula el cociente de los dos números y muéstrala al usuario
		
		if (num2 == 0) {
			System.out.println("no se puede dividir por cero.");
		} else {
			double cociente = (double) num1 / num2;
			System.out.println("el cociente de los dos numeros es " + cociente);
		}
	}

	// Define el método estático calcularOperacion
	
	public static int calcularOperacion(int num1, int num2, int operacion) {
		
		switch (operacion) {
			
			case SUMA:
				return num1 + num2;
			
			case RESTA:
				return num1 - num2;
				
			default:
				return 0;
		}
	}
}
