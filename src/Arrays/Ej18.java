package Arrays;

public class Ej18 {

	public static float[] filtro_ventana_deslizante (float[] input, int n) {
		
		float[]	filtrado = new float[input.length-(n-1)];
		int contador=0;
		
		for(int i=n-1;i<input.length;i++) {
			
			float suma = 0;
			
			for(int j=i-(n-1);j<=i;j++) {
				
				suma+=input[j];
				
			}
			
			float media = suma/n;
			
			filtrado[contador]=media;
			contador++;
			
		}
		
		return filtrado;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] prueba = {-1f,4f,-5f,5f,10f};
		float[] resultado = Ej18.filtro_ventana_deslizante(prueba,6);
		for(int i=0;i<resultado.length;i++) {
			
			System.out.println(resultado[i]);
		
	}

}
	
}
