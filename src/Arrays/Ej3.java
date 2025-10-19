package Arrays;

public class Ej3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]Ej=new int[300];
		
		for(int i=0;i<300;i++) {
			
			Ej[i]=i%16;
			
		}
		
		for(int k=0;k<300;k++) {
			
			System.out.println(Ej[k]);
			
		}
		
	}

}
