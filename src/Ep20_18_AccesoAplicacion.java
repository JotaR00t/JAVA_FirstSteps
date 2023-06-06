import javax.swing.*;

public class Ep20_18_AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="JC";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contrasenya porfavor");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("contrasenya incorrecta");
			}
			
		}
		
		System.out.println("contrasenya correcta. acceso permitido");

	}

}
