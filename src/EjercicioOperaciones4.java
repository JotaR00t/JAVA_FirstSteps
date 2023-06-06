import java.util.*;

public class EjercicioOperaciones4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero_introducido;
		double top_mayor=0;
		int posicion_temp_i=0;
		int posicion_temp_f=0;
		int entero;
		String cadenatexto_repite;
		int comprobar_siserepite;
		
		//CREO OBJETO SCANNER
		Scanner sc=new Scanner(System.in);
		
		//START Y RESET DEL PROGRAMA
		do {
		comprobar_siserepite=-1;
		//USUARIO INTRODUCE UN NUMERO Y ME ASEGURO DE QUE SEA ENTERO Y POSITIVO
		do {
			System.out.println("Por favor, introduce un número entero");
			numero_introducido=(int) sc.nextInt();
		
		}while(numero_introducido<=0);
		
		//VARIABLE DE LA MATRIZ DEL TAMAÑO 2D DE num_introducido
		int [][] matriz = new int [numero_introducido] [numero_introducido];
		
		//LE APORTO UN NUMERO ALEATORIO A CADA SLOT DEL ARRAY Y BUSCO EN EL ARRAY "matriz" EL NUMERO MAS GRANDE Y APUNTO SU UBICACIÓN
		for(int i=0;i<numero_introducido;i++) {
			
			for(int f=0;f<numero_introducido;f++) {
				
				matriz[i][f]=(int)(Math.random()*100);
				if(top_mayor<matriz[i][f]) {
					top_mayor=matriz[i][f];
					posicion_temp_i=i;
					posicion_temp_f=f;
				}
			}
		}
		entero=(int) Math.round(top_mayor);
		System.out.println("El numero mas grande del array que has creado es: " + entero);
		System.out.println("Fila " + posicion_temp_i);
		System.out.println("Columna " + posicion_temp_f);
		
		//PREGUNTO SI QUIERE REPETIR
		do {
			System.out.println("¿Quieres volver a ejecutar el programa? (si/no)");
			cadenatexto_repite=sc.nextLine();
		
			
			if(cadenatexto_repite.equalsIgnoreCase("si")) {
				comprobar_siserepite=1;
			}else if(cadenatexto_repite.equalsIgnoreCase("no")){
				comprobar_siserepite=0;
			}
		} while(comprobar_siserepite == -1);
	
		//FIN Y COMPROBACION IF RESET DEL PROGRAMA
	}while(comprobar_siserepite==1);
	//CIERRO OBJETO SCANNER PARA EVITAR PROBLEMAS DE RECURSOS
	sc.close();
	}		
}
