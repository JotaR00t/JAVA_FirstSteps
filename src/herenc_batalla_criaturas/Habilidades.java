package herenc_batalla_criaturas;

//import java.util.ArrayList;

public class Habilidades {
	
	
	
	public Habilidades(String habilidad, int multiplicador) {
		this.habilidad=habilidad;
		this.multiplicador=multiplicador;
	}

	
	String habilidad;
	int multiplicador;

	
	
	
	
//	public ArrayList<Habilidades> getLista_habilidades() {
//		return lista_habilidades;
//	}
//	public void setLista_habilidades(ArrayList<Habilidades> lista_habilidades) {
//		this.lista_habilidades = lista_habilidades;
//	}
	public String getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	public int getMultiplicador() {
		return multiplicador;
	}
	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}
	@Override
	public String toString() {
		return habilidad; //------------AQUI QUIERO QUE ME MUESTRE TAMBIEN EL DAÑO QUE VA A HACER
	}

}
