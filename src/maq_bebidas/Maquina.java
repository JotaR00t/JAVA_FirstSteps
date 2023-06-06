package maq_bebidas;

import java.util.ArrayList;

public class Maquina {

	public static ArrayList<String> lista_bebidas = new ArrayList<String>();

	public static ArrayList<Bebida> listaBebidasObjeto = new ArrayList<Bebida>();
	
	


	public static void main(String[] args) {
		
		
		
//		 listaBebidasObjeto.add(Fanta);
//		 listaBebidasObjeto.add(nuka_cola);
//		 listaBebidasObjeto.add(monsta);
	}

	public static void agregarBebida(String bebidas) {

		lista_bebidas.add(bebidas);

	}

	// INTENTO ADD LISTA PERO DE OBJETO BEBIDA , NO-STRING
	public static void agregarBebidaObjeto(Bebida bebidas) {

		listaBebidasObjeto.add(bebidas);

	}

	public static ArrayList<String> getLista_bebidas() {
		return lista_bebidas;
	}

	public static void mostrarTodas() {
		for (String e : lista_bebidas) {
			System.out.println(e);
		}
	}

	public static void mostrarTodasIndex() {
		for (byte i = 0; i < lista_bebidas.size(); i++) {
			String seleccion_bebida = lista_bebidas.get(i);
			System.out.println(i + ") " + seleccion_bebida);
		}
	}

	public static void comprarBebida(double dinero, byte boton_bebida) {
		//VAR DONDE METO EL OBJETO SELEC PARA USAR SUS METODOS
		Bebida seleccion_bebida;
		//PRECIO DEL OBJETO
		double precio_bebida_seleccionada;
		double dinero_insertado=dinero;
		double falta_pagar;
		seleccion_bebida=listaBebidasObjeto.get(boton_bebida);
		precio_bebida_seleccionada=seleccion_bebida.getPrecio();
		//HAS METIDO LO SUFICIENTE PARA PAGAR?
		if(dinero_insertado>=precio_bebida_seleccionada) {
			//TRUEQUE
			dinero_insertado = dinero_insertado - precio_bebida_seleccionada;
			System.out.println("COMPRA REALIZADA!!!!! \n AQUI TIENE  SU "+seleccion_bebida.getNombre()+", QUE LO DISFRUTE.");
			if(dinero_insertado>0) {
				//DEVOLUCION
				System.out.println("Tome su cambio = "+dinero_insertado+" euros , Gracias por usar nuestros servicios.");
			}
		}else {
			//POR SI NO HA PAGADO SUFICIENTE
			falta_pagar = precio_bebida_seleccionada - dinero_insertado;
			System.out.println("Faltan "+falta_pagar+" euros para poder comprar esto.");
		}
		

	}

//	public static void opciones(byte num) {
//		System.out.println("OPCIONES: \n");
//		System.out.println("1) Mostrar bebidas");
//		System.out.println("2) Insertar monedas");
//		System.out.println("3) Elegir bebida");
//		System.out.println("4) Salir");
//		byte boton=num;
//		switch(boton) {
//		case 1:
//			mostrarTodas();
//		case 2:
//			System.out.println("¿Cuanto dinero quiere insertar?");
//			break;
//		case 3:
//			//
//			break;
//		case 4:
//			//
//			break;
//		}
//		
//	}

}

//		lista_bebidas.add(nombre, precio, stock);

//
//		lista_bebidas.add(fanta_limon);
//		lista_bebidas.add(nuka_cola);
//		lista_bebidas.add(monsta);

//		
//		for(Bebida e: lista_bebidas) {
//			System.out.println(e);
//		}
