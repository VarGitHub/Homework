package home.work4;

public class Laptop {
	String brandName;
	String modelName;
	int ram;
	String CPU;
	int hardDrive;
	double screen;
	static int maxRam;
	double price;
	
	public Laptop(String brandName, String modelName, int ram, int hardDrive, double price) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.price = price;
	}
	
	public Laptop(String brandName, String modelName, int hardDrive, int ram, double screen, double price) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.hardDrive = hardDrive;
		this.ram = ram;
		this.screen = screen;
		this.price = price;
	}
	
	static void setMaxRam(int maxRam) {
		Laptop.maxRam = maxRam;
	}
	
	public String toString() {
		return "This is " + brandName + " " + modelName + " " + ram + "GB RAM" + hardDrive + "GB HD " + maxRam + "GB Max RAM laptop"; 
	}
	
	
}
