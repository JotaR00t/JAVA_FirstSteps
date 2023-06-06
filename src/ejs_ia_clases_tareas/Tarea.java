package ejs_ia_clases_tareas;

public class Tarea {
	
	public Tarea(String nombre, String fecha, String importancia) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.importancia = importancia;
	}
	
	
	
	@Override
	public String toString() {
		return "Tarea [nombre= " + nombre + ", fecha= " + fecha + ", importancia= " + importancia + "]";
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getImportancia() {
		return importancia;
	}
	public void setImportancia(String importancia) {
		this.importancia = importancia;
	}



	private String nombre;
	private String fecha;
	private String importancia;
	
	

}
