package libreto_sucio;

import java.util.Scanner;

public class Producto {

	private int PORCENTAJE_MAXIMO_DESCUENTO = 50;
	private String producto;
	private double valor_producto;
	private int valor_descuento=0;
	private double valor_final_descontado;

	public Producto(String producto, double valor_producto, int valor_descuento, double valor_final_descontado) {
		this.producto = producto;
		this.valor_producto = valor_producto;
		this.valor_final_descontado = valor_final_descontado;
		this.valor_descuento = valor_descuento;
	}
	
	public Producto() {
		
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getValor_producto() {
		return valor_producto;
	}

	public void setValor_producto(double valor_producto) {
		this.valor_producto = valor_producto;
	}

	public double getValor_final_descontado() {
		return valor_final_descontado;
	}

	public void setValor_final_descontado(double valor_final_descontado) {
		this.valor_final_descontado = valor_final_descontado;
		double mat_temp=(this.valor_final_descontado*valor_descuento)/100;
		this.valor_final_descontado=this.valor_final_descontado-mat_temp;
	}

	public void setValor_descuento(int valor_descuento) {
		this.valor_descuento = valor_descuento;
	}

	public int getValor_descuento() {
		return valor_descuento;
	}
	
	public int getPorcentaje_max_desc() {
		return PORCENTAJE_MAXIMO_DESCUENTO;
	}

	@Override
	public String toString() {
		return "Producto [producto=" + producto + ", valor_final_descontado=" + valor_final_descontado + "]";
	}

	public static void main(String[] args) {
		

		Producto producto_vacio=new Producto();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce nombre del producto");
		String nombre = scanner.nextLine();
		System.out.println("Introduce valor del producto");
		double valor_producto = scanner.nextInt();
		
		System.out.println("Introduce % descuento");
		do {
			int valor_descuento_temporal=producto_vacio.getValor_descuento();
			if(valor_descuento_temporal!=0) {
				System.out.println("Tienes que introducir un % inferior a 50%");
			}
		producto_vacio.setValor_descuento(scanner.nextInt());
		}while(producto_vacio.getValor_descuento()>producto_vacio.getPorcentaje_max_desc());
		
		producto_vacio.setValor_final_descontado(valor_producto);
		
		Producto producto_lleno=new Producto(nombre, valor_producto, producto_vacio.getValor_descuento(), producto_vacio.getValor_final_descontado());
		System.out.println(producto_lleno.toString());

	}

}
