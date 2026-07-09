package JavaTraining;

public abstract class day9_abstraction {
	
	
	public abstract void add();
	
	public static void sub() {
		
		
		
		int a =10, b=20;
		
		int c = a-b;
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		sub();

	}

}

class training_2 extends day9_abstraction{
	
	
	public void add() {
		
		int a =10, b=20;
		
		int c = a+b;
		
		System.out.println(c);
		
		
	}
	
	public static void printDetails() {
		
		sub();
	}
	
	public static void main(String[] args) {
		printDetails();

	}
	
	
}


