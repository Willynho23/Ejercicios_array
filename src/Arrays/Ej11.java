package Arrays;

import java.util.Scanner;

public class Ej11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int condicion = 1;
		int contador=1;
		int[]copia=new int[0];
		
		System.out.println("Por favor, introduzca números, el 0 indicará que hasta ahí llegará tu lista");
		
		while(condicion!=0) {
			
			int[]lista=new int[contador];
			lista[contador-1]=sc.nextInt();
			
			if(lista[contador-1]==0) break;
			for(int i=0;i<copia.length;i++) {
				lista[i]=copia[i];
			}
			
			copia=lista;
			condicion=lista[contador-1];
			contador++;
			
		}
		
		int suma=0;
		int max=0;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<copia.length;i++) {
			
			suma+=copia[i];
			
			if(copia[i]>max) {
				max=copia[i];
			}
			if(copia[i]<min) {
				min=copia[i];
			}
			
		}
		
		System.out.println("media: "+(suma/copia.length+". Máximo: "+max+". Mínimo: "+min+"."));
		sc.close();
	}

}
