package herenc_batalla_criaturas;

import java.util.ArrayList;
import java.util.List;

public class Dragon extends CriaturaMagica{

	public Dragon(String nombre, int atk, int def, int vida) {

		super(nombre, atk, def, vida);
		// CUANDO HAGA EL OBJETO, USA EL CONSTRUCTOR "OGRO" Y -CREEEO- QUE EL
		// CONSTRUCTOR OGRO USA AL CONSTRUCTOR PADRE
		// PASANDOLE LOS PARAMETROS NECESARIOS DEL SUPER
		this.otorgarHabilidades();
	}



	private static List<Habilidades> lista_habilidades = new ArrayList<>();

	public void mostrarHabilidades() {
		for (int i = 0; i < lista_habilidades.size(); i++) {
			Habilidades h = lista_habilidades.get(i);
			System.out.println(i+") "+h.toString());
		}
	}

	private void otorgarHabilidades() {
		Habilidades golpe = new Habilidades("Golpe", 2);
		lista_habilidades.add(golpe);
		Habilidades llamarada = new Habilidades("Llamarada", 10);
		lista_habilidades.add(llamarada);
	}
	
	public Habilidades seleccionaHabilidad(int boton) {
		return lista_habilidades.get(boton);
	}
	
	public String dameClase() {
		return "Dragon";
	}

}
