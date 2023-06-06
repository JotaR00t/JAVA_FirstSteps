package ejs_ia_clases;

//import java.util.ArrayList;
//import java.util.List;

public class Entrenador {

	private String nombre;
	private int edad;
	
	private Pokemon[] equipo = new Pokemon[6]; // RECUERDA, EL "TIPO" DEL ARRAY ES LA CLASE INSTANCIADA EN SÍ, PARA QUE
												// CONTENGA TODOS SUS METODOS

	public Entrenador(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Pokemon[] getEquipo() {
		return equipo;
	}
	
	public void setEquipo(Pokemon[] equipo) {
		this.equipo = equipo;
	}

//	public String toString() {
//		return "Entrenador [EQUIPO = " + Arrays.toString(equipo) + "]";
//	}
//

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	

	

	public void agregarPokemon(Pokemon parametro_pokemon) {
		for (int j = 0; j < equipo.length; j++) {
			if (equipo[j] == null) {
				equipo[j] = parametro_pokemon;
				break;
			}
		}
	}
		//MUESTRO LA REPRESENTACIÓN TEXTUAL (METODO TOSTRING) CON VARIABLES CONCATENADAS "DE POKEMON"
		//Y DEPOSITO EL ARRAY EQUIPO #CON EL METODO QUE ME PERMITE USAR GRACIAS A DARLE TIPO POKEMON
		//Y ESE METODO ME PERMITE LLENAR LAS VARIABLES CON LOS PARAMETROS POKEMON ACTIVOS
	public String mostrarLista() {

		String pokemonStrings = "";

		for (int i = 0; i < equipo.length; i++) {
			if (equipo[i] != null) {

				//pokemonStrings += equipo[i].toString();	//HACE LO MISMO QUE ABAJO
				pokemonStrings = pokemonStrings.concat(equipo[i].toString());
			}
		}
		
		
//		for (Pokemon p : equipo) {					//METODO MAS RESUMIDO
//			if (p != null) {
//
//				//pokemonStrings += equipo[i].toString();
//				pokemonStrings = pokemonStrings.concat(p.toString());
//			}
//		}

//		List<Pokemon> varlista=new ArrayList<>();		//INVESTIGAR ESTO, SE PODRIA HACER TOD EN UNA SOLA LINEA
//		varlista.forEach(p -> {
//			System.out.println(p.toString());
//		});
		return pokemonStrings;
		
	}
	

}
