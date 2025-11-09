package Arrays;

public class Ej20 {

	public static double[] interpolacion (int[] input) {
		
		double[] interpolado = new double[2*input.length-1];
		int contador=0;
		for(int i=0;i<input.length;i++) {
			
			if(i==input.length-1)interpolado[contador]=input[i];
			
			else {
			interpolado[contador]=input[i];
			contador++;
			interpolado[contador]=(double)(input[i]+input[i+1])/2;
			contador++;
			}
		}
		
		return interpolado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prueba = {1,2,9,2,10};
		
		double[] resultado = Ej20.interpolacion(prueba);
		
		for(int i=0;i<resultado.length;i++) {
			
			System.out.println(resultado[i]);
			
		}
	}

}
