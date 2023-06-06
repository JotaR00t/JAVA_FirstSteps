package ejs_ia_clases_tareas;

import javax.swing.JOptionPane;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaTareas listaTareas = new ListaTareas(); //SI SE PUEDE INSTANCIAR SIN CONSTRUCTOR. PERO ENTONCES NO TIENE ARGUMENTOS

		String nombre_tar;
		String dia_string;
		String mes_string;
		String ano_string;
//		int dia;
//		int mes;
//		int ano;
		String fecha;
		String importancia_string;
// 		int importancia;
		String reset;

		do {
			nombre_tar = JOptionPane.showInputDialog("¿Cómo quieres describir la tarea?");

			dia_string = JOptionPane.showInputDialog("Introduce el DÍA en que tienes que hacer la taréa");
			mes_string = JOptionPane.showInputDialog("Introduce el MES en que tienes que hacer la taréa");
			ano_string = JOptionPane.showInputDialog("Introduce el AÑO en que tienes que hacer la taréa");

							// POR SI TENGO QUE CONVERTIR STRING A ENTEROS
//		dia=Integer.parseInt(dia_string);
//		mes=Integer.parseInt(mes_string);
//		ano=Integer.parseInt(ano_string);

			fecha = dia_string.concat(" / " + mes_string + " / ").concat(ano_string);

			importancia_string = JOptionPane.showInputDialog("¿Del 1 < 5 importancia?");
			// importancia=Integer.parseInt(importancia_string);

			Tarea new_tarea = new Tarea(nombre_tar, fecha, importancia_string); // OBJETO CON LOS DATOS

			listaTareas.addTarea(new_tarea);

			reset = JOptionPane.showInputDialog("queres poner otra tarea? y/n");

		} while (reset.equals("y"));

		
		
		for(Tarea t: listaTareas.getMemory_tareas()) {
			System.out.println(t);
		}
		

	}

}
