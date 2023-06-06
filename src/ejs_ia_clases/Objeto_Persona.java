package ejs_ia_clases;

public class Objeto_Persona {
	
	private String nombre;	//VARIABLES DECLARADAS
	private int edad;		//VARIABLES DECLARADAS
	private double altura;	//VARIABLES DECLARADAS
	
	
	public void setNombre(String nombre){ 	//SETTER sin usar
		this.nombre = nombre;
	}
	public void setEdad(int edad){ 			//SETTER sin usar
		this.edad = edad;
	}
	public void setAltura(double altura){ 	//SETTER sin usar
		this.altura = altura;
	}
	// Los setters se utilizan para establecer los valores de los atributos DESPUES de haber creado el objeto. ej calculo e porcentaje sobre un valor puesto en el main
	
	public String getNombre() { 			//GETTER
		return nombre;
	}
	public int getEdad() { 					//GETTER
		return edad;
	}
	public double getAltura() { 			//GETTER
		return altura;
	}
	
	
	//CONSTRUCTOR DE LA CLASE Objeto_Persona PARA INICIALIZAR OBJETOS/VARIABLES
	public Objeto_Persona(String nombre, int edad, double altura) {
		this.nombre = nombre; 	//RECUERDA, ESCRIBIR LOS PARAMETROS EN EL CONSTRUCTOR
		this.edad = edad;		//NO HACE REFERENCIA A LAS VARIABLES CREADAS FUERA DE ESTE SINO A SI MISMO
		this.altura = altura;	//POR ESO LE ASIGNO A LAS "VARIABLES" LOS "PARAMETROS DE ENTRADA"
	}
}

