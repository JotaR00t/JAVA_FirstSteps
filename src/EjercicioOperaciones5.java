import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class EjercicioOperaciones5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada_texto;//ENTRADA DEL USUARIO
		char check_letra;//ME SIRVE PARA COMPROBAR CARACTERES POR SEPARADO
		boolean sin_numeros;//BANDERA PARA EXCLUIR NUMEROS
		int i;//FOR. PARA PODER USARLO DENTRO DEL FOR INTERNO DE OTRO FOR Y OTRO INTERNO DE UN WHILE
		int z;//FOR. PARA PODER USARLO DENTRO DEL FOR INTERNO DE OTRO FOR Y OTRO INTERNO DE UN WHILE
		int n;//FOR. PARA PODER USARLO DENTRO DEL FOR INTERNO DE OTRO FOR Y OTRO INTERNO DE UN WHILE
		
		List<Character> alfabetoMayus = new ArrayList<>(); //ESTO ES UNA VARIABLE DE TIPO LISTA. NO UN ARRAY
		for (char c = 'A'; c <= 'Z'; c++) {
		    alfabetoMayus.add(c);
		}
		
		List<Character> alfabetoMinus = new ArrayList<>(); //ENTONCES TIENEN FUNCIONES Y METODOS DIFERENTES DE USO
		for (char d = 'a'; d <= 'z'; d++) {
		    alfabetoMinus.add(d);
		}
		
			do { //ENTRADA Y COMPROBACION SI NO ESTA VACIO O TIENE UN ESPACIO
				sin_numeros=true;//BANDERA LIMPIA ANTES DE COMPB
				entrada_texto=JOptionPane.showInputDialog("Por favor, introduce un texto cualquiera que no contenga numeros");
				
				for(n=0;n<=(entrada_texto.length()-1);n++) {
					check_letra=entrada_texto.charAt(n);
					if(Character.isDigit(check_letra)) {
						sin_numeros=false;
					}
				}
				
			}while(entrada_texto.isEmpty()||entrada_texto.isBlank()||sin_numeros==false);
			//FIN DEL INTRO USUARIO
			
			
			
			
			
			char[][] matrix_letras=new char[(entrada_texto.length())][2];//DECLARO CONT DE CADA LETRA CON SLOTS LONGITUD DEL TEXTO
			
			for(i=0;i<=(entrada_texto.length()-1);i++) {
				
				check_letra=entrada_texto.charAt(i);//SEPARO CADA LETRA EN UNA VAR PARA PODER COMPROBARLA
				
				matrix_letras[i][0]=check_letra;// ALMACENO CADA LETRA PARA CONTARLAS
				matrix_letras[i][1]='0';// DOY VALOR INICIAL A CADA SUB_SLOT DE CADA LETRA 
				
				for(z=0;z<=i;z++) {//COMPRUEBA HASTA LA POSICION DEL CHECK CUANTAS COPIAS
					
					if(matrix_letras[z][0]==check_letra) {
						
						matrix_letras[i][1]++;//AQUI QUIERO UN CONTADOR PERO NECESITO MANEJAR NUMEROS, NO CHAR
					}
					
				}
				
				if(alfabetoMayus.contains(check_letra)) {//DIFERENCIO MAYUS DE MINUS
					System.out.println("Letra MAYUS " + matrix_letras[i][0] + " tiene " + matrix_letras[i][1] + " copia/s.");
				}else if(alfabetoMinus.contains(check_letra)) {
					System.out.println("Letra minus " + matrix_letras[i][0] + " tiene " + matrix_letras[i][1] + " copia/s.");
				}
			}

	}

}
