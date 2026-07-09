package training_java;

public abstract class day9_LearningJavaOOPS {
	
	
	
	
	private static String name = "";
	
	public abstract void add();
	
	
	public static void getName() {
		
		name = "John";
	}
	
	
	public static void printName() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		

	}

}


class training extends day9_LearningJavaOOPS{
	
	
	public void add() {
		
		int a = 10, b= 20;
	}
	
	public static void main(String[] args) {
		
		printName();
	}
}