import javax.swing.*;


public class Ep22_20_PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		
		do {
			
			genero=JOptionPane.showInputDialog("introduce tu genero: (H/M)");
		
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce altura en cm"));
		
		int pesoIdeal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			
			pesoIdeal=altura-110;
		}
		
		else if(genero.equalsIgnoreCase("M")) {
			
			pesoIdeal=altura-120;
		}
		
		System.out.println("tu peso ideal es " + pesoIdeal);
	}

}
