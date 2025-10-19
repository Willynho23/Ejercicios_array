package Arrays;

public class Ej2 {
	
	public static int getPos (int[]a, int p) {
		
		int pos=-1;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==p) {
				
				pos=i;
				break;
			}
			
		}
		
		return pos;
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]prueba= {1,2,2,4};
		System.out.println(Ej2.getPos(prueba,2));
		
	}

}
