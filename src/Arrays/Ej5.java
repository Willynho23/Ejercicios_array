package Arrays;

public class Ej5 {

	public static float media(float[] in) {
		
		float suma=0;
		float media=0;
		
		for(int i=0;i<in.length;i++) {
			
			suma+=in[i];
			
		}
		
		media=suma/in.length;
		
		return media;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] lol= {1.2f,3.2f,0f};
		
		System.out.println(Ej5.media(lol));;
		
	}

}
