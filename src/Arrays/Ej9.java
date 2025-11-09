package Arrays;

public class Ej9 {

static	public char[] invertir(char[]input) {
		
		char[] invertido = new char[input.length];
		
		for(int i=0;i<input.length;i++) {
			
			invertido[input.length-1-i]=input[i];
			
		}
		
		return invertido;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[]prueba= {'l','o','l','a','z','o'};
		
		for(int i=0;i<Ej9.invertir(prueba).length;i++) {
			
			System.out.println(Ej9.invertir(prueba)[i]);
			
		}
		
		
		
	}

}
