package Arrays;

public class Ej7 {

	public static int[] multiplicar_array (int[]input,int multiplicar) {
		
		int[] devolver=new int[input.length];
		
		for(int i=0;i<input.length;i++) {
			
			devolver[i]=input[i]*multiplicar;
			
		}
		
		return devolver;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
