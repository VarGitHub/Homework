package home.work4;

public class Container {

	public static void main(String[] args) {
		 int integerArray[] = new int[20];
		 
		 for (int i = 0; i < 20; i++) {
			 integerArray[i] = (int) Math.round(Math.random() * 100);
		 }
		 
		 for (int i = 0; i < 20; i++) {
			 System.out.println("Integer_" + (i+1) + ": " + integerArray[i]);
		 }

	}

}
