package home.work4;


public class TestLaptop {

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop("Dell", "G3", 8, 64, 1299.90);
		Laptop laptop2 = new Laptop("Dell", "XPS", 128, 8, 15.0, 1500.00);
		
		Laptop.setMaxRam(32);
		System.out.println(laptop1);
		System.out.println(laptop2);
	}

}
