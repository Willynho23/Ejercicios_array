package Arrays;

public class Ej10 {

	static char[]invertir(char[]input){
		
		for(int i=0; i<input.length/2;i++) {
			
			char guardado = input[i];
			input[i]=input[input.length-1-i];
			input[input.length-1-i]=guardado;
		}
		
		return input;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]prueba= {'l','o','l','a','z','o','U','W'};
		
		for(int i=0;i<Ej9.invertir(prueba).length;i++) {
			
			System.out.println(Ej9.invertir(prueba)[i]);
			
		}
	}

}
