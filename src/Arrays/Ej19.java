package Arrays;

public class Ej19 {

	public static int[] muestreo (int[]input,int n) {
		
		if(n<=0) {
			System.out.println("tonto");
			return null;
		}
		
		if(n%2==1) {
		int[] muestreado = new int[(input.length/n)];
		
		int contador=0;
		
		for(int i=0;i<input.length;i++) {
			
			if(i%n==0) {
				
				muestreado[contador]=input[i];
				contador++;
				
			}
			
		}
		
		return muestreado;
		
		}
		
		else {
		int[] muestreado = new int[(input.length/n)+1];
		
		int contador=0;
		
		for(int i=0;i<input.length;i++) {
			
			if(i%n==0) {
				
				muestreado[contador]=input[i];
				contador++;
				
			}
			
		}
		
		return muestreado;
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prueba = {};
		
		int[] resultado = Ej19.muestreo(prueba, 10);
		
		for(int i=0;i<resultado.length;i++) {
			
			System.out.println(resultado[i]);
			
		}
		

}
}