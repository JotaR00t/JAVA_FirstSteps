package maq_bebidas;

//import java.util.ArrayList;

public class Bebida {

	private static final int PRECIO_MAXIMO = 999;

	private static int totalBebidas = 0;

	private String nombre;
	private double precio;
	private int stock;

	

	public Bebida(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		totalBebidas++;
		Maquina.agregarBebida(toString());
		Maquina.agregarBebidaObjeto(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Bebida [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}

//	public Bebida toValue() {
//			return this;
//	}

	public static int getTotalBebidas() {
		return totalBebidas;
	}

	public static int getPrecioMaximo() {
		return PRECIO_MAXIMO;
	}

	public void comprarBebida() {
		if (stock > 0) {
			stock--;
		} else {
			System.out.println("ESTA BEBIDA ESTÁ AGOTADA");
		}
	}
	


}
