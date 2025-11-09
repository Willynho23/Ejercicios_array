package Arrays;

import java.util.Scanner;

public class Ej23 {
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Hola, me vas a dar primero las dimensiones de las matrices, a ver si las pones bien pedazo de crack");
		
		System.out.println("Primero ponme el número de filas de la primera matriz");
		
		int fil1=sc.nextInt();
		
		System.out.println("Ahora ponme el número de columnas");
		
		int col1=sc.nextInt();
		
		System.out.println("Ahora ponme el número de filas de la segunda matriz");
		boolean dimensiones_validas=false;
		
		int fil2=0;
		while(dimensiones_validas==false) {
			
		int fil2copia=sc.nextInt();
		
		if(fil2copia==col1) {
			dimensiones_validas=true;
			fil2=fil2copia;
		}
			
		else {
			System.out.println("So tonto, no has aprendido nada en álgebra o que?");
			fil2copia=0;
		}
		}
		
		System.out.println("Ahora ponme el número de columnas de la segunda matriz");
		
		int col2 = sc.nextInt();
		
		int [][] matriz1= new int[fil1][col1];
		int	[][] matriz2= new int[fil2][col2];
		
		System.out.println("Vamos a empezar con la primera matriz");
		
		for(int i=0;i<fil1;i++) {
			
			for(int j=0;j<col1;j++) {
				
				matriz1[i][j]=sc.nextInt();
			}
			
			System.out.println("Fin de fila");
			
		}
		
		System.out.println("Se ha guardado la primera matriz");
		
		System.out.println("Ahora la segunda");
		
		for(int i=0;i<fil2;i++) {
			
			for(int j=0;j<col2;j++) {
				
				matriz2[i][j]=sc.nextInt();
			}
			
			System.out.println("Fin de fila");
			
		}
		
		System.out.println("Perfecto, ya tenemos ambas matrices, se procederá ahora mismo a su multiplicación");
		
		int[][]resultado=new int[fil1][col2];
		
		for(int i=0;i<fil1;i++) {
			
			for(int j=0;j<col2;j++) {
				
				resultado[i][j]=0;
				
				for(int k=0;k<fil2;k++) {
					resultado[i][j]+=matriz1[i][k]*matriz2[k][j];
				}
				
			}
			
		}
		
		System.out.println("A continuación, te mostraré toa la paranoia");
		System.out.println("");
		System.out.println("");
		
		for(int i=0;i<fil1;i++) {
			for(int j=0;j<col1;j++) {
				System.out.print(matriz1[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("x");
		System.out.println("");
		
		for(int i=0;i<fil2;i++) {
			for(int j=0;j<col2;j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("=");
		System.out.println("");
		
		for(int i=0;i<fil1;i++) {
			for(int j=0;j<col2;j++) {
				System.out.print(resultado[i][j]+" ");
			}
			System.out.println("");
		}
		sc.close();
	}

}
