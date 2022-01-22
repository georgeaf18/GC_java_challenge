package my_app;

public class UsedCar extends Car {
	private double mileage = 0;
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setPrice(price);
		this.setMileage(mileage);
	}
	
	
	public double getMileage() {
		return this.mileage;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public String toString() {
		return  "Used " + this.getYear() + " " + this.getMake().toUpperCase() + " " + this.getModel().toUpperCase() 
				+ " priced at $" + this.getPrice() + " with " + this.getMileage() + " miles."; 	
	}
}