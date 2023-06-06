
public class Ep27_25_Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] matrix = new int [4] [5];
		
		matrix[0][0]=5432;
		matrix[0][1]=867;
		matrix[0][2]=436;
		matrix[0][3]=123;
		matrix[0][4]=8;
		
		matrix[1][0]=675;
		matrix[1][1]=564;
		matrix[1][2]=2345;
		matrix[1][3]=765;
		matrix[1][4]=687;
		
		matrix[2][0]=1234;
		matrix[2][1]=678;
		matrix[2][2]=352;
		matrix[2][3]=89765;
		matrix[2][4]=6345;
		
		matrix[3][0]=2134;
		matrix[3][1]=6543;
		matrix[3][2]=6789;
		matrix[3][3]=568;
		matrix[3][4]=4;

		for(int i=0;i<4;i++) {
			System.out.println("");
			for(int z=0;z<5;z++) {
				
				System.out.print(matrix[i][z]+" ");
			}
			
			
		}
		System.out.println("");
		System.out.println("");
		int [][] matrox= {
				{1234,56743,97,5235,1234},
				{132,65432,2354,3645,7809},
				{6578,1324,765496,3124,867},
				{7689,2345,123,7568,4532}
		};
		
		for(int[]fila:matrox) {
			System.out.println("");
			for(int filaB:fila) {
				
				System.out.print(filaB + " ");
			}
		}
		
	}

}
