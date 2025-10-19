package Arrays;

public class Ej6 {

	public static float[] mayores_fila (float[][] input) {
		
		float[] mayores = new float[input.length];
		
		for(int i=0;i<input.length;i++) {
			
			float mayor=0;
			
			for(int j=0;j<input[0].length;j++) {
				
				if(input[i][j]>mayor) {
					
					mayor=input[i][j];
					
				}
				
			}
			
			mayores[i]=mayor;
			
		}
		
		return mayores;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        float[][] matriz = new float[3][4];

        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (float) (Math.random() * 10); 
            }
        }

        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }
		
        float[] prueba=Ej6.mayores_fila(matriz);
        
        for(int k=0;k<prueba.length;k++) {
        	
        	System.out.printf("%.2f",prueba[k]);
        	System.out.println();
        }
        
	}

}
