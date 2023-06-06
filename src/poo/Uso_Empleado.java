package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Empleado empleado1=new Empleado("Pago Gomez", 85000, 1990, 12, 17); //INSTANCIAR CLASE EMPLADO
		//INSTANCIAR CLASE EMPLEADO - NOMBRE DE LA INSTANCIA/OBJETO - LLAMAR AL CONSTRUCTOR "EMPLEADO" - STRING , INT , DATE.
		Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		Empleado empleado3=new Empleado("Maria Martin", 105000, 2002, 03, 15);
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		/* System.out.println("Nombre : "+empleado1.dameNombre()+" Sueldo: "+empleado1.dameSueldo()
				+" Fecha de Alta: "+empleado1.dameFechaContrato());
		System.out.println("Nombre : "+empleado2.dameNombre()+" Sueldo: "+empleado2.dameSueldo()
		+" Fecha de Alta: "+empleado2.dameFechaContrato());
		System.out.println("Nombre : "+empleado3.dameNombre()+" Sueldo: "+empleado3.dameSueldo()
		+" Fecha de Alta: "+empleado3.dameFechaContrato()); */
		
		Empleado[] misEmpleados= new Empleado[3]; //ARRAY DE CLASE EMPLEADO . NO SE PONE STRING
		/* Si se usara un arreglo de String (String[]) en su lugar, solo se podrían almacenar los nombres de los empleados, 
		 * pero no se tendría acceso a sus sueldos, fechas de alta, ni se podría utilizar el método subeSueldo() para actualizar los sueldos de los empleados.
		 */
		misEmpleados[0]=new Empleado("Pago Gomez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		misEmpleados[2]=new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		for(Empleado e: misEmpleados) {
		//OBJ DE CLASE - TEMP VAR - ARRAY A LA QUE SE REFIERE	
			e.subeSueldo(5);
			
			System.out.println("Nombre : "+e.dameNombre()+" Sueldo: "+e.dameSueldo()
			+" Fecha de Alta: "+e.dameFechaContrato());
		}

	}

}


class Empleado{ //EDIFICAMOS OBJETO
	
	public Empleado(String nom, double sue, int anyo, int mes, int dia) { //METODO CONSTRUCTOR Y SUS PARAMETROS
		
		nombre=nom; //LA VARIABLE NOMBRE SERA = AL PARAMETRO NOM
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(anyo, mes-1, dia); //CLASE CONSTRUCTORA DE FECHAS - JUSTO NECESITA 3 DATOS
		//NOM.CLASE    - NOM.OBJETO - NEW ES LLAMAR AL CONSTRUCTOR DE LA CLASE
		
		altaContrato=calendario.getTime();  //GETTIME ES UN METODO DE GREGORIANCALENDAR. DEVUELVE/ALMACENA UN OBJETO FECHA QUE DEVUELVE..
		//VAR   -  OBJETO   - 
	}
	
	public String dameNombre() {//GETTER
		
		return nombre;
	}
	
	public Date dameFechaContrato() { //GETTER
		
		return altaContrato;
	}

	public double dameSueldo() { //GETTER
		
		return sueldo;
	}
	
	public void subeSueldo(double porcentaje) { //SETTER
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	
	 
	
	
	
	
	// EN ESTE CASO, VARIABLES DECLARADAS AL FINAL DE LA CLASE EMPLEADO Y NO AL PRINCIPIO
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato; 
}