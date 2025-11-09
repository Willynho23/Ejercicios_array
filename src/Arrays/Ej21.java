package Arrays;

public class Ej21 {

	public static int desviados (float[] input) {
		
		float suma=0;
		int contador =0;
		
		for (int i=0; i<input.length;i++) {
			
			suma+=input[i];
			
		}
		
		float media=suma/input.length;
		
		float sumapotente=0;
		
		for (int i=0; i<input.length;i++) {
			
			sumapotente+=Math.pow(input[i]-media,2);
			
		}
		
		float desv = (float) Math.sqrt(sumapotente/input.length);
		
		for(int i=0; i<input.length;i++) {
			if(input[i]>2*desv) contador++;
		}
		
		return contador;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] prueba = {-1f,4f,-5f,5f,10f,80f};
		int resultado = Ej21.desviados(prueba);
		System.out.println(resultado);
	}

}
