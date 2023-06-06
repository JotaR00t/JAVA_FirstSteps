import javax.swing.*;
import java.util.*;

public class ep19_17_EjAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String forma=JOptionPane.showInputDialog("Elige area a calcular de n1 cuadrado, n2 rectangulo, n3 triangulo, n4 circulo.");
		int formaI=Integer.parseInt(forma);
		

		if(formaI==1){
			String Lado=JOptionPane.showInputDialog("Introduce los Cm del lado porfavor");
				JOptionPane.showMessageDialog(null, "por favor, ingrese un valor numerico.");
			Double LadoF=Double.parseDouble(Lado);
			JOptionPane.showMessageDialog(null, "El area de tu cuadrado es " + (LadoF*LadoF) + " cm");
		}
 		else if(formaI==2){
			
 			String Base=JOptionPane.showInputDialog("Introduce los Cm de la base porfavor");
 			String Altura=JOptionPane.showInputDialog("Introduce los Cm de la altura porfavor");
 			Double BaseF=Double.parseDouble(Base);
 			Double AlturaF=Double.parseDouble(Altura);
 			JOptionPane.showMessageDialog(null, "El area de tu rectangulo es " + (BaseF*AlturaF) + " cm");
		}
		else if(formaI==3){
			
			String Base=JOptionPane.showInputDialog("Introduce los Cm de la base porfavor");
 			String Altura=JOptionPane.showInputDialog("Introduce los Cm de la altura porfavor");
 			Double BaseF=Double.parseDouble(Base);
 			Double AlturaF=Double.parseDouble(Altura);
 			JOptionPane.showMessageDialog(null, "El area de tu triangulo es " + (BaseF*AlturaF/2) + " cm");
		}
		else if(formaI==4){
			
			String Lado=JOptionPane.showInputDialog("Introduce los Cm del radio porfavor");
			Double LadoF=Double.parseDouble(Lado);
			JOptionPane.showMessageDialog(null, "El area de tu circulo es " + (LadoF*LadoF*Math.PI) + " cm");
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Has introducido otro valor que no cumple ninguna de las 4 opciones. Adios.");
		}
	}

}
