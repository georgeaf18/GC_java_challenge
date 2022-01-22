package my_app;

public class Car {
	public Car(){
		this.setMake("");
		this.setModel("");
		this.setYear(1900);
		this.setPrice(0.0);
		
	};
	
	public Car(String make, String model, int year, double price){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setPrice(price);
	}
	
	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	private String make;
	private String model;
	private int year;
	private double price;
	
	public String toString() {
		return this.getYear() + " " + this.getMake().toUpperCase() + " " + this.getModel().toUpperCase() + " priced at $" + this.getPrice();					
	}
}
