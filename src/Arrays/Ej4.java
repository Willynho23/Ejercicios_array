package Arrays;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[]Ej=new char[300];
		
		for(int i=0;i<300;i++) {
			
			if(i%16>9) {
			
			switch(i%16) {
			
			case 10: Ej[i]='A';
				break;
			case 11: Ej[i]='B';
				break;
			case 12:	Ej[i]='C';
				break;
			case 13: Ej[i]='D';
				break;
			case 14: Ej[i]='E';
				break;
			case 15: Ej[i]='F';
				break;
			}
			
			}
			
			else Ej[i]=Integer.toString(i%16).charAt(0);
			
		}
		
		for(int k=0;k<300;k++) {
			
			System.out.println(Ej[k]);
			
		}
		
		
		
	}

}
