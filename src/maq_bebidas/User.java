package maq_bebidas;

//import java.util.ArrayList;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bebida Fanta = new Bebida("Fanta de Limon", 1.20, 20);
		Bebida nuka_cola = new Bebida("NukaCola", 2.50, 30);
		Bebida monsta = new Bebida("Monsta", 4.40, 20);

		Scanner entrada = new Scanner(System.in);

		double dinero = 0.0;
		byte boton_maquina;
		byte boton_bebida;

		do {
			System.out.println("\n\nDinero Insertado: " + dinero + " euros");
			System.out.println("OPCIONES: \n");
			System.out.println("1) Mostrar bebidas");
			System.out.println("2) Insertar monedas");
			System.out.println("3) Elegir bebida");
			System.out.println("4) Salir");

			boton_maquina = entrada.nextByte();

			switch (boton_maquina) {
			case 1:
				Maquina.mostrarTodas();
				break;
			case 2:
				System.out.println("¿Cuanto dinero quiere insertar?");
				dinero = entrada.nextDouble();
				break;
			case 3:
				Maquina.mostrarTodasIndex();
				boton_bebida = entrada.nextByte();
				if (dinero > 0) {
					Maquina.comprarBebida(dinero, boton_bebida);
				}else {
					System.out.println("No has introducido dinero.");
				}
				break;
			case 4:
				System.out.println("Gracias por usar nuestros servicios, adios!");
				break;
			}
		} while (boton_maquina != 4);
		
		entrada.close();

	}

}
