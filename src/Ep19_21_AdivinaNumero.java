import java.util.Scanner;


public class Ep19_21_AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		int cont=0;
		
		// si el num aleatorio fuera 0 , daria correcto si no usase do,while y solo usase while
		// lo que no me permitiria ni meter el numero del usuario. Seria un error. con un 99% de no ocurrir pero puede.
		
		
		do{
			
			System.out.println("introduce un numero porfavor");
			
			numero=entrada.nextInt();
			
			cont++;
			
			if(aleatorio<numero) {
				
				System.out.println("El numero tiene que ser mas bajo");
			}
			else if(aleatorio>numero) {
				
				System.out.println("El numero tiene que ser mas alto");
			}
			
		}while(numero!=aleatorio);
		
		
		System.out.println("correcto");
		System.out.println("has usado "+cont+" intentos");
	}

}
