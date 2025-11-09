package Arrays;

public class Ej14 {

	static float[] normalizar (float[]input) {
		
		float max=0;
		for(int i=0;i<input.length;i++) {
			
		if(input[i]>max) {
			max=input[i];
		}
			
		}
		
		float[] normalizado = new float[input.length];
		
		for(int i=0;i<input.length;i++) {
			
			normalizado[i]=input[i]/max;
			
		}
		
		return normalizado;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] prueba = {-1f,-4f,-5f,5.6f,-7.1f};
		float[] resultado = Ej14.normalizar(prueba);
		for(int i=0;i<resultado.length;i++) {
			
			System.out.println(resultado[i]);
			
		}
		
		
	}

}
