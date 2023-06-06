package ejs_ia_clases;

public class Listando_Personas {
	
	public static void main(String[] args) {
		
		/*MODO BASICO DE HACERLO
		//INSTANCIAR CLASE OBJETO_PERSONA CON CONSTRUCTORES
		Objeto_Persona Persona1 = new Objeto_Persona("Antonino", 24, 1.75);
		Objeto_Persona Persona2 = new Objeto_Persona("Arturo", 26, 1.72);
		Objeto_Persona Persona3 = new Objeto_Persona("Sara", 26, 1.68);
		
		//FINALMENTE USO LOS METODOS DEL ULTIMO CONSTRUCTOR DE INSTANCIADO QUE HE CREADO.
		System.out.println(Persona1.getNombre() + " tiene " + Persona1.getEdad() + " años. Y mide " + Persona1.getAltura());
		System.out.println(Persona2.getNombre() + " tiene " + Persona2.getEdad() + " años. Y mide " + Persona2.getAltura());
		System.out.println(Persona3.getNombre() + " tiene " + Persona3.getEdad() + " años. Y mide " + Persona3.getAltura());
		*/
		
		
		//SEGUNDO MODO DE HACERLO CON ARRAY
		Objeto_Persona[] Persona = new Objeto_Persona[3];
		
		Persona[0]=new Objeto_Persona("Antonino", 24, 1.75);
		Persona[1]=new Objeto_Persona("Arturo", 26, 1.72);
		Persona[2]=new Objeto_Persona("Sara", 26, 1.68);
		
		for(Objeto_Persona p: Persona) {
			System.out.println(p.getNombre() + " tiene " + p.getEdad() + " años. Y mide " + p.getAltura());
		}
	}

}
