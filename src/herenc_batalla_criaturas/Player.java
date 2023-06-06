package herenc_batalla_criaturas;

import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dragon smaug = new Dragon("Dragon Smaug", 9, 8, 1000);
//		Elfo legolas = new Elfo("Legolas", 4, 9, 100);
//		Ogro azog = new Ogro("Azog el profanador", 6, 8, 100);

//		Habilidades golpe = new Habilidades("Golpe", 2);
//		Habilidades llamarada = new Habilidades("Llamarada", 10);
//		Habilidades cuchilla= new Habilidades("Cuchilla", 4);
//		Habilidades barrido = new Habilidades("Barrido", 5);

		byte salida = 0;

		do {
			// SE MUESTRAN LAS CRIATURAS
			System.out.println("Elige criatura P1: \n");

			for (int i = 0; i < CriaturaMagica.listaCriaturas.size(); i++) {
				System.out.println(i + ") " + CriaturaMagica.listaCriaturas.get(i));
			}

			Scanner entrada_player = new Scanner(System.in);

			// PLAYER ELIGE CRIATURA
			byte boton_selec_criatura_p1;
			CriaturaMagica criatura_elegida_p1;

			boton_selec_criatura_p1 = entrada_player.nextByte();
			criatura_elegida_p1 = CriaturaMagica.listaCriaturas.get(boton_selec_criatura_p1);
			System.out.println("Has elegido a " + criatura_elegida_p1.toStringNombre() + " " + "\n\n");

			// SE MUESTRAN CRIATURAS -VS-
			System.out.println("Elige criatura VS a enfrentar: \n");

			for (int i = 0; i < CriaturaMagica.listaCriaturas.size(); i++) {
				System.out.println(i + ") " + CriaturaMagica.listaCriaturas.get(i));
			}

			// PLAYER ELIGE CRIATURA -VS-
			byte boton_selec_criatura_vs;
			CriaturaMagica criatura_elegida_vs;

			boton_selec_criatura_vs = entrada_player.nextByte();
			criatura_elegida_vs = CriaturaMagica.listaCriaturas.get(boton_selec_criatura_vs);
			System.out.println("Has elegido a " + criatura_elegida_vs.toStringNombre() + " de contrincante." + "\n\n");

			// SHOW VERSUS
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println(criatura_elegida_p1.toStringNombre() + criatura_elegida_p1.toStringVida()
					+ "   --------   VS   --------   " + criatura_elegida_vs.toStringNombre()
					+ criatura_elegida_vs.toStringVida() + "\n\n"); // ---------------------- QUIERO QUE ME MUESTRE LA
																	// VIDA


			
			
			
			
			
			
//			//      REFUNDICION.....................
//			System.out.println("\n\n\n");
//			// QUIERO HACER UNA VARIABLE DONDE SE VA
//			// DEPOSITAR EL OBJETO O (EL DATO PARA HACER OTRA VARIABLE) QUE HA SELEC. EL JUG
//			// Y QUIERO DE ESA VARIABLE INVOCAR EL INDEX DEL ARRAY DE "DRAGON" POR EJEMPLO
//
//			// EL TIPO DEL OBJETO INTERIOR DE LA VAR ES DRAGON
//			System.out.println("EL TIPO DEL OBJETO INTERIOR DE LA VAR ES DRAGON " + criatura_elegida_p1.getClass());
//
//			// PERO EL TIPO DE LA VARIABLE EN SI MIMSA, ES -CRIATURA_MAGICA-
//			System.out.println("PERO EL TIPO DE LA VARIABLE EN SI MISMA, ES -CRIATURA_MAGICA- " + criatura_elegida_p1);
//
//			// REFUNDICION DE LA VAR A OTRA VARIABLE TIPO DRAGON
//			Dragon smaug_elegido = (Dragon) criatura_elegida_p1;
//
//			// COMPRUEBO QUE SE HAYA CAMBIADO EL TIPO AHORA DE LA NUEVA VARIABLE Y FUNCIONA
//			System.out.println(
//					"COMPRUEBO QUE SE HAYA CAMBIADO EL TIPO AHORA DE LA NUEVA VARIABLE A - TIPO DRAGON Y FUNCIONA "
//							+ smaug_elegido.getClass());
//
//			// LA NUEVA VARIABLE AHORA SI SE COMPORTA COMO SI FUESE DE TIPO DRAGON.
//			smaug_elegido.mostrarHabilidades();
//			
//			//VUELVO A COMPROBAR LA CLASE CON METODO PERSONALIZADO
//			System.out.println( "VUELVO A COMPROBAR LA CLASE CON METODO PERSONALIZADO " );
//			smaug_elegido.dameClase();
//			
//			//METO STRING A VAR
//			String tipo = smaug_elegido.dameClase();
//			
//			//
//			//tipo hola = hola;
//			
//	//			FIN DE REFUNDICION..............................................
//			System.out.println("\n\n\n");
			
			
			
			
			

			// ENSEÑAR HABILIDADES
			System.out.println("Elige habilidad con la que atacar: \n\n");
			smaug.mostrarHabilidades();

			// PLAYER ELIGE HABILIDAD
			byte boton_selec_habilidad;
			System.out.println();

//		Habilidades habilidad_elegida;//------------------------------------------------------------------------COMO PONGO EN EL TIPO DE DATO EL TIPO DE CRIATURA QUE HA ELEGIDO PLAYER, SIN PONER "DRAGON"
//		boton_selec_habilidad=entrada_player.nextByte();
//		habilidad_elegida=Habilidades.lista_habilidades.get(boton_selec_habilidad);
//		System.out.println("Has elegido a "+habilidad_elegida.toString()+" "+"\n\n");

			// SALIR EN TODO CASO
			salida = entrada_player.nextByte();
			entrada_player.close();
		} while (salida != 66);

	}

}
