package training_java;

public class day9_oops {
	
	
//	OOPS --> Object Oriented Programming Structure
//	1. classes
//	2. objects
//	3. polymorphism
//	4. abstraction
//	5. inheritance
//	6. Encapsulation
	
//	Modifier --> Public, Private, Protected
	
	
//	Public --> 
//	private --> Can be accessed only within the class
//	protected --> Can be accessed only with the package
	
	
	private static String name = "";
	
	
	public static void getName() {
		
		name = "John";
	}
	
	
	private static void printName() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		
		

	}

}


class demo extends day9_oops{
	  
	  
	  static day9_oops oj;
	 
	 
	  String name;
	  
	  
	  demo(){
		
		
		oj = new day9_oops();
	  }
	 
	  public static void main(String []args) {
			
		
		  oj.getName();
		
		  day9_oops ok =  new day9_oops();
		
		
	  }
	
	
}