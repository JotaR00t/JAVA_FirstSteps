import javax.swing.JOptionPane;

public class ep17_Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=1000.0;
		// mostrar solo 2 primeros decimales. 
		System.out.printf("%1.2f", x/3);
		System.out.println("");
		
		String num1=JOptionPane.showInputDialog("Introduce un numero");
		
		double num2=Double.parseDouble(num1);
		
		System.out.print("la raiz cuadrada de " + num2 + " es ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));

	}

}
