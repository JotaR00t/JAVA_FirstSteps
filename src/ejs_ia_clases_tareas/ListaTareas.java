package ejs_ia_clases_tareas;

import java.util.ArrayList;

public class ListaTareas {



		private ArrayList<Tarea> memory_tareas = new ArrayList<>();
		
	
		public void addTarea(Tarea new_tarea) {			//USU>CONT>CADENA ARRAYS
								
			memory_tareas.add(new_tarea);
		}


		public ArrayList<Tarea> getMemory_tareas() {
			return memory_tareas;
		}


		public void setMemory_tareas(ArrayList<Tarea> memory_tareas) {  //ESTE NO LO USO, NO SE SI SERIA MAS ORDENADO O LOGICO QUE EL ADDTAREA
			this.memory_tareas = memory_tareas;
		}
		
		


//		public mostrarTareas() {
//			//MUESTRA TAREAS CON SUS FECHA Y IMPORT
//		}
//		
//		public mostrarCalendario() {
//			//MUESTRA CALENDARIO
//		}

		
}
