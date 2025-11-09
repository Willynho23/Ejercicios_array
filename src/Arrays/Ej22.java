package Arrays;

public class Ej22 {
	
	
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


public static int desviados (String[] input_string) {
	
	float[]input=new float[input_string.length];
	for(int i=0;i<input_string.length;i++) {
		
		input[i]= Float.parseFloat(input_string[i].replace(',', '.'));
		
	}
	
	
	
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
		
		float[] prueba = {-1f,4f,-5.3f,5f,100f,90.5f};
		int resultado = Ej22.desviados(prueba);
		System.out.println(resultado);
		
		String[] prueba2 = {"-1","4","-5,3","5","100","90,5"};
		int resultado2 = Ej22.desviados(prueba2);
		System.out.println(resultado2);
}
}