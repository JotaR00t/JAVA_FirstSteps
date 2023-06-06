import javax.swing.*;

public class Ep24_22_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//el objetivo de este programa es devolver el resultado factorial de un numero
		
		//acciono resultado
		int resultado=1;
		
		//
		int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
		
		for(int i=numero;i>0;i--) {
			
			resultado=resultado*i;
		}
		System.out.println("el resultado de " + numero + " es " + resultado);

	}

}
