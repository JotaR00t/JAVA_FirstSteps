package libreto_sucio;

//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//
//import javax.swing.JOptionPane;
//
//import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.util.Date;

public class Prueba_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados emp1 = new Empleados("Jorge");
		Empleados emp2 = new Empleados("Antonio");
		Empleados emp3 = new Empleados("Miriam");

		System.out.println(emp1.devuelveDatos());
		System.out.println(emp2.devuelveDatos());
		System.out.println(emp3.devuelveDatos());
		System.out.println(Empleados.devuelveIdSiguiente());
		System.out.println(Empleados.devuelveIdSiguiente());
		System.out.println(Empleados.devuelveIdSiguiente());

		ArrayList<String> miLista = new ArrayList<String>();

		miLista.add("\n \n Hola");
		miLista.add(" que tal,");
		miLista.add(" como estás?");
		miLista.add(1, "me cuelo en la pose 0/1");

		for (String t : miLista) {
			System.out.println(t);
		}

		
		//INTENTO HACER UN FORMATO DE FECHAS ---------------- PERO NECESITO DE "EXCEPCIONES"CAP120 TRY:CATCH???????
		//String inputFecha = JOptionPane.showInputDialog("Introduce la fecha en formato dd/MM/yyyy:");
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		//Date fecha = formatter.parse(inputFecha);
	}

}

class Empleados {
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
		Id = IdSiguiente;
		IdSiguiente++;
	}

	public String devuelveDatos() {
		return "El nombre es: " + nombre + "la sección es " + seccion + " y el Id= " + Id;
	}

	public static String devuelveIdSiguiente() {
		return "IdSiguiente vale= " + IdSiguiente;
	}

	private String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;

}