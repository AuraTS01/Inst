package training_java;

public class day10_exceptionHandling {

	public static void main(String[] args) {
		
		try {
			int a = 10, b = 0;
			
			int c =  a / b;
			
			System.out.println(c);
			
			
		}catch(Exception e) {
			
			System.out.println("Int Cannot store the String value" + e);	
			
		}
		
		
		
		

	}

}
