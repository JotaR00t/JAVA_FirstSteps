
public class ep13_Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Juan";
		
		System.out.println("Mi nombre tiene "+nombre.length()+" letras.");
		
		System.out.println("la primera letra de "+nombre+" es "+nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("la ultima letra de "+nombre+" es "+nombre.charAt(ultima_letra-1));

	}

}
