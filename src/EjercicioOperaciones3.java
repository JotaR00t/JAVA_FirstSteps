import java.util.Scanner;

public class EjercicioOperaciones3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo el objeto Scanner
		Scanner entrada = new Scanner(System.in);
		
		// le pido al usuario que me de el valor celsius y lo almaceno 
		
		System.out.println("Dime cuantos grados celsius hace por favor: ");
		double celsius = entrada.nextFloat();
		
		// acciono la clase FACTOR_CONVERSION para convertir primero los Celsius a Farenheit
		
		double Fahrenheit = celsiusToFahrenheit(celsius);
		
		// acciono la clase creada redondearEntero para depositar la conversion en el resultado final 
		
		int resultadoEntero = redondearEntero(Fahrenheit);
		
		// muestro en consola el resultado final de la conversion
		
		String mensaje = String.format("%.1f grados Celsius equivalen a %.1f grados Farenheit", celsius, Fahrenheit);
		System.out.println(mensaje);
		
	}

	// método estático para redondear la temperatura resultante a un número entero.
	
	public static int redondearEntero(double numero) {
		
		return Math.round((int) numero);
	}
	
	// constante de clase para representar la fórmula de conversión de Celsius a Fahrenheit.
	
	public static final double celsiusToFahrenheit(double num1) {
		
		return (num1 * 9.0 / 5.0) + 32;
	}
}
