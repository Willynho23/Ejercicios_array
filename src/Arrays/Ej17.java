package Arrays;

public class Ej17 {

	public static float[] filtro (float[]input, float umbral) {
		
		int contador1=0;
		
		for(int i=0;i<input.length;i++) {
			
			if(input[i]>umbral) {
				contador1++;
			}
			
		}
		
		float[] filtrado = new float[contador1];
		
		int contador2=0;
		
		for(int i=0;i<input.length;i++) {
			
			if(input[i]>umbral) {
				filtrado[contador2]=input[i];
				contador2++;
			}
			
		}
		
		return filtrado;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] prueba = {-1f,4f,-5f,5.6f,-7.1f};
		float[] resultado = Ej17.filtro(prueba,1f);
		for(int i=0;i<resultado.length;i++) {
			
			System.out.println(resultado[i]);
		
	}

}
	
}


