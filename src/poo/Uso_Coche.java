package poo;

import javax.swing.*;

public class Uso_Coche {
//todos los programas aunque tengan varias partes, empiezan siempre por LA PARTE que tenga main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creando un objeto. Tambien llamado instanciar una clase.
		
		Coche micoche=new Coche();	//INSTANCIAR CLASE. EJEMPLAR DE CLASE. INSTANCIAR UN OBJETO DEL TIPO "Coche"
	//NOMBRE DE LA CLASE - NOMBRE DEL OBJETO - OPERADOR "new" - NOMBRE DEL CONSTRUCTOR
		
			
	
		
		
		
		
		
		micoche.establece_color(JOptionPane.showInputDialog("Dime color"));; //ACCEDIENDO AL SETTER DEL OTRO COCHE.JAVA y DANDOLE EL VALOR
//CLASE OBJETO INSTANCIADA - METODO SETTER PARA DARLE COLOR - PARAMETRO color_coche STRING REQUERIDO DESDE EL OTRO COCHE.JAVA PARA INTRODUCIR "VALOR"
		//CUANDO ESCRIBES MICOCHE. EL ASISTENTE DETECTA ESTABLECE COLOR DEL OTRO COCHE.JAVA
		
	
		//micoche.color="rosa"; NO SE PUEDE PORQUE COLOR ESTA ENCAPSULADO EN "PRIVATE" DEL COCHE.JAVA
		
		
		System.out.println(micoche.dime_datos_generales()); //ACC. AL GETTER DEL OTRO COCHE.JAVA
		
		//System.out.println("este coche tiene " + Renault.ruedas + " ruedas.");
											/* eclipse reconoce al objeto Renault perteneciente
											a la clase coche */
		
		
		//POR QUE ES NECESARIO PRIMERO EL SETTER Y LUEGO EL GETTER???
		//EN ESTE CASO ESPECIAL LA VARIABLE COLOR=AZUL DE COCHE.JAVA -NO- SE DECLARA REALMENTE HASTA QUE SE USA EL METODO DENTRO DEL CUAL ESTÁ
		//SINO NO HARIA FALTA SACAR EL METODO SETTER
		
		micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es " + micoche.precio_coche());
		
		
		
		
		
	
	}

}
