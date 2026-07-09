package training_java;

public class Day7_While {

	public static void main(String[] args) {
	
		
//		syntax
		
//		while(condition){ }
		
//		do{ }while(condition);
		
		int j = 0;
		
		int count = 0;
		
		do{
			
			System.out.println(j);
			
			if(count == 2) {
				
				count++;
			}
			
			
			j++;
		}while(j > 5);

	}

}
