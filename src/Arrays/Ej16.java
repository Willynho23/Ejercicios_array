package Arrays;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca su dimensión favorita");
		int dimension = sc.nextInt();
		int[][] matriz = new int [dimension][dimension];
			//Hacer un bucle for doble, cada y luego jugar con las coordenadas (i,j) e (j,i), establecer condiciones y de ahí sacar la matriz simétrica
		
		int diagonal = (int) (100*Math.random());	
		
		for(int i=0;i<dimension;i++) {
			
			for(int j=0;j<dimension;j++) {
				
				
				
				if(i==j)matriz[i][j]=diagonal;
				
				if(i<j)matriz[i][j]= (int) (100*Math.random());	
				
				
			}
			
		}
		
		for(int i=0;i<dimension;i++) {
			
			for(int j=0;j<dimension;j++) {
				
				if(i>j)matriz[i][j]=matriz[j][i];
				
			}
			
		}
		
		for(int k=0;k<dimension;k++) {
			
			for(int l=0;l<dimension;l++) {
				
				int num=matriz[k][l];
				
				System.out.print(num+" ");
				
			}
			
			System.out.println("");
		}
		sc.close();
	}

}
