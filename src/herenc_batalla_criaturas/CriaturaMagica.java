package herenc_batalla_criaturas;

import java.util.ArrayList;
import java.util.List;

public class CriaturaMagica {
	
	public CriaturaMagica(String nombre, int atk, int def, int vida) {
		this.nombre=nombre;
		this.atk=atk;
		this.def=def;
		this.vida=vida;
		addCriaturaLista(this);
	}
	
	String nombre;
	int atk;
	int def;
	int vida;
	
	public static void addCriaturaLista(CriaturaMagica criatura) {
		
		listaCriaturas.add(criatura);
		
	}
	
	
	
	
	
	static List<CriaturaMagica> listaCriaturas = new ArrayList<CriaturaMagica>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public List<CriaturaMagica> getListaCriaturas() {
		return listaCriaturas;
	}

//	public void setListaCriaturas(ArrayList<CriaturaMagica> listaCriaturas) {
//		this.listaCriaturas = listaCriaturas;
//	}

	
	public String toString() {
		return "CriaturaMagica [nombre=" + nombre + ", atk=" + atk + ", def=" + def + ", vida= " + vida +"]";
	}
	
	public String toStringNombre() {
		return nombre;
	}
	
	public String toStringVida() {
		return "HP: "+vida;
	}
	

}
