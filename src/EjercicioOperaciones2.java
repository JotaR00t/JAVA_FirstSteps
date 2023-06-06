import java.util.Scanner;

public class EjercicioOperaciones2 {
	 // Declarar la constante PI
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear un objeto Scanner
        
		Scanner entrada = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la longitud y el ancho del rectángulo
        
		System.out.println("por favor, ingresa la longitud del rectangulo: ");
        double longitud = (double) entrada.nextInt();
        
        System.out.println("por favor, ingresa el ancho del rectangulo: ");
        double ancho = (double) entrada.nextInt();
        
        // Calcular el área del rectángulo
        
        double area = (double) longitud*ancho;
        
        // Calcular el perímetro del rectángulo
        
        double perimetro = (double) 2*(longitud*ancho);
        
        // Redondear el área y el perímetro a enteros utilizando el método redondearEntero()
        
        int areaRedondeada = redondearEntero(area);
        
        int perimetroRedondeado = redondearEntero(perimetro);
        
        // Imprimir el área y el perímetro del rectángulo
        
        System.out.println("el area del rectangulo es: " + area);
        
        System.out.println("el perimetro del rectangulo es: " + perimetro);
        
    }
    
    // Definir el método estático redondearEntero()
    
		public static int redondearEntero(double numero) {
			return Math.round((float) numero);
		}
}


