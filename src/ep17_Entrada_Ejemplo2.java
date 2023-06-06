import javax.swing.*;

public class ep17_Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		//si no lo convierto a entero la edad seria 181 porque era un simple string
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("Hola " + nombre_usuario + " el anyo que viene tendras " + (edad_usuario+1) + " anyos");

	}

}
