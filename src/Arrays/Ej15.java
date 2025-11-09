package Arrays;

public class Ej15 {
	
	static float[] masacre (float[] input) {
		
		float[] masacrados = new float[input.length];
		int contador=0;
		
		for(int i=0;i<input.length;i++) {
			
			if(i==0) {
				if(input[i]>input[i+1]) {
					masacrados[contador]=input[i];
					contador++;
				}
			}
			
			else if(i==input.length-1) {
				
				if(input[i-1]<input[i]) {
					masacrados[contador]=input[i];
					contador++;
				}
			}
			else {
			if(input[i-1]<input[i] && input[i]>input[i+1]) {
				masacrados[contador]=input[i];
				contador++;
				}
			}
		}
		
		return masacrados;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] prueba = {-1f,-4f,-5f,5.6f,-7.1f};
		float[] resultado = Ej15.masacre(prueba);
		for(int i=0;i<resultado.length;i++) {
			
			System.out.println(resultado[i]);
		
	}

}
	
}
