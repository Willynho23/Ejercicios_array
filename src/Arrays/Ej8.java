package Arrays;

public class Ej8 {

	static int contar_negativos(float[]input) {
		
		int cuenta=0;
		for(int i=0;i<input.length;i++) {
			
			if(input[i]<0) cuenta++;
			
		}
		
		return cuenta;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] prueba = {-1f,-4f,-5f,5.6f,-7.1f};
		
		System.out.println(Ej8.contar_negativos(prueba));
		
		
	}

}
