//package herenc_batalla_criaturas;
//
//import java.util.ArrayList;
//
//public class Ogro extends CriaturaMagica {
//
//	public Ogro(String nombre, int atk, int def, int vida) {
//
//		super(nombre, atk, def, vida);
//		// CUANDO HAGA EL OBJETO, USA EL CONSTRUCTOR "OGRO" Y -CREEEO- QUE EL
//		// CONSTRUCTOR OGRO USA AL CONSTRUCTOR PADRE
//		// PASANDOLE LOS PARAMETROS NECESARIOS DEL SUPER
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Habilidades golpe = new Habilidades("Golpe", 2);
//		lista_habilidades.add(golpe);
//		Habilidades barrido = new Habilidades("Barrido", 5);
//		lista_habilidades.add(barrido);
//	}
//
//	private static ArrayList<Habilidades> lista_habilidades = new ArrayList<>();
//
//	public void mostrarHabilidades() {
//		for (int i = 0; i <= lista_habilidades.size(); i++) {
//			Habilidades h = lista_habilidades.get(i);
//			System.out.println(h.toString());
//		}
//	}
//
//}
