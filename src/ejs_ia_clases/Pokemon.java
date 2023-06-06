package ejs_ia_clases;

public class Pokemon {
	
	private String nombre;
	private String tipo;
	private int nivel;
	
	public Pokemon(String nombre, String  tipo, int nivel) { //SE USA PARA INICIALIZAR ESAS VARIABLES Y DEFINE EL FUTURO CONSTRUCTOR
			//CONSTRUCTOR									//QUE CONSTRUIRA EL OBJ. QUE CONTENGA ESTAS PROPIEDADES
		
		this.nombre=nombre;
		this.tipo=tipo;
		this.nivel=nivel;
		
	}


	
	@Override
	public String toString() {
		return "[" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + "]\n";
	}

	public String getNombre() {
		return nombre;
		
	}
	public String getTipo() {
		return tipo;
		
	}
	public int getNivel() {
		return nivel;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	public void setNivel(int nivel) {
		this.nivel=nivel;
	}
	
}
