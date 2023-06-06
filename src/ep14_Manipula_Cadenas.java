
public class ep14_Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Hoy es un estupendo dia para aprender a programar en Java";
		
		
		String frase_resumen=frase.substring(0, 29)+"irnos a la playa y olvidarnos de todo"+" y "+frase.substring(29, 57);
		
		System.out.println(frase_resumen);
		
		String alumno1, alumno2;
		
		alumno1="David";
		alumno2="david";
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));

	}

}
