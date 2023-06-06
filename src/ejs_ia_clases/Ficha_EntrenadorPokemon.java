package ejs_ia_clases;

public class Ficha_EntrenadorPokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Entrenador luis = new Entrenador("Luis", 21);
		Entrenador fernando = new Entrenador("Fernando", 24);
		Entrenador cristina = new Entrenador("Cristina", 32);

		// LUIS
		Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 25); // CREAR OBJETO CON CONSTRUCTOR "OBJETO=POKEMON"															// "NOMBRE DE ESTE OBJETO AQUI=PIKACHU"
		Pokemon blastoise = new Pokemon("Blastoise", "Agua", 40);
		Pokemon charizard= new Pokemon("Charizard", "Fuego", 60);
		
		System.out.println("Nombre " + luis.getNombre());
		System.out.println("Edad " + luis.getEdad());

		luis.agregarPokemon(pikachu);
		luis.agregarPokemon(blastoise);
		luis.agregarPokemon(charizard);

		System.out.println("Equipo: \n" + luis.mostrarLista());

		// FERNANDO
		Pokemon weedle = new Pokemon("Weedle", "Bicho", 7); // ESTO SOLO CREA LA VARIABLE CON TODOS LOS DATOS QUE ME PIDEN LOS PARAMETROS DE "POKEMON"
		Pokemon ekans = new Pokemon("Ekans", "Veneno", 15); // ESTA VARIABLE LA PUEDO LUEGO DEPOSITAR EN LA LISTA USANDO METODO .AGREGARPOKEMON
		Pokemon cofing = new Pokemon("Cofing", "Veneno", 15);
		
		System.out.println("Nombre " + fernando.getNombre());
		System.out.println("Edad " + fernando.getEdad());

		fernando.agregarPokemon(weedle); // LLEVO AL POKE WEEDLE AL FOR DE AGREGAR POKEMON 1ER SLOT
		fernando.agregarPokemon(ekans);
		fernando.agregarPokemon(cofing);
		
		System.out.println("Equipo: \n" + fernando.mostrarLista());

		// CRISTINA
		Pokemon pidgey = new Pokemon("Pidgey", "Volador", 11); 
		Pokemon paras = new Pokemon("Paras", "Bicho", 21);
		Pokemon metapod= new Pokemon("Metapod", "Bicho", 44);
		
		System.out.println("Nombre " + cristina.getNombre());
		System.out.println("Edad " + cristina.getEdad());

		cristina.agregarPokemon(pidgey);// UTILIZO METODO ENTRENADOR DE "ESE OBJETO -CRISTINA-" , PIENSA EN ESE OBJETO COMO UNA NUEVA VARIABLE
		cristina.agregarPokemon(paras);// TODOS LOS METODOS SUCEDEN DENTRO DE CRISTINA MIENTRAS LA LLAME
		cristina.agregarPokemon(metapod);
		
		System.out.println("Equipo: \n" + cristina.mostrarLista());
		
		String pato = "cuac ";
		String perro= "guau ";
		
		System.out.println(pato.concat(perro).concat(perro));
	}
}