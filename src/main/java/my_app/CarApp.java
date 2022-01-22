package my_app;
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Car> carLot = new ArrayList<Car>();
		
		
		try {
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");

		
		Car newCar1 = new Car("Ford", "F-150", 2021, 46389.67);
		carLot.add(newCar1);
		
		Car newCar2 = new Car("Tesla", "model S", 2022, 80543.94);
		carLot.add(newCar2);
		
		Car newCar3 = new Car("Toyota", "Prius", 2023, 25783.03);
		carLot.add(newCar3);
		
		
		
		UsedCar usedCar1 = new UsedCar("honda", "civic", 2021, 13212.32, 42034);
		carLot.add(usedCar1);
		
		UsedCar usedCar2 = new UsedCar("honda", "CRV", 1994, 122.32, 452434);
		carLot.add(usedCar2);
		
		UsedCar usedCar3 = new UsedCar("Mercedes-Benz", "G-class", 2017, 127931.77, 20018);
		carLot.add(usedCar3);
		
		
		
		
		ArrayList<Car> carList = new ArrayList<Car>();

		// Uncomment to unable part 1
		carList = getCarList(carList);
		
		// Uncomment to unable part 2
		//initiateCarStore(carLot);
		
		} catch(Exception e) {
			throw e;
		} finally {
		scanner.close();
		}
	}
	
	
	private static ArrayList<Car> getCarList(ArrayList<Car> carList){
		
		try {
			
			int amountCarsToAdd = 0;
			
			System.out.println("How many cars do you want to add?");
			
			amountCarsToAdd = Integer.parseInt(scanner.nextLine());
			
			
			for (int i = 0; i < amountCarsToAdd; i++) {
			
				Car newCar = createNewCarFromInput(i + 1);
				
				carList.add(newCar);

			}
			
			printList(carList);	
			
		} catch(Exception e) {
			throw e;
		}
		
		
		return carList;
	}
	
	//Used to print the menu in the console
	private static void printList(ArrayList<Car> list) {
		
		
		String leftAlignFormat = "| %-3s | %-5s | %-15s | %-15s | %-4d | %.2f |%n";
		
		System.out.println("Currently In Inventory");
		
		
		System.out.format("+-----+-------+-----------------+-----------------+------+------------+%n");
		System.out.format("| No. |Cond.  | Make            | Model           | Year | Price      |%n");
		System.out.format("+-----+-------+-----------------+-----------------+------+------------+%n");
		
		
		int i = 1;
		for (Car car : list ) {
		    System.out.format(leftAlignFormat,i ,car instanceof UsedCar ? "Used" : "New" ,car.getMake().toUpperCase(), car.getModel().toUpperCase(), car.getYear(), car.getPrice());
		    i++;
		}
		
		System.out.format("+----+-------+-----------------+-----------------+------+------------+%n");

	}
	
	//Used to create a Car object from users' input
	private static Car createNewCarFromInput(int i) {
		String make = "";
		String model = "";
		int year = 0;
		double price = 0;
				
		
		
		System.out.print("Enter Car #" + i + " Make: ");
		make = scanner.nextLine();
		
		System.out.print("Enter Car #" + i + " Model: ");
		model = scanner.nextLine();
		
		System.out.print("Enter Car #" + i + " Year: ");
		year = Integer.parseInt(scanner.nextLine());
		
		
		System.out.print("Enter Car #" + i + " Price: ");
		price = Double.parseDouble(scanner.nextLine());
		
		
		Car newCar = new Car(make, model, year, price);
		
		return newCar;
	};

	//2nd part
	
	private static void initiateCarStore(ArrayList<Car> carLot, Scanner scanner) {

		int indexToDelete = -1;
		
		printList(carLot);
		
		System.out.print("Please, select a vehicle by typing the number from the list and hit enter: ");
		
		
		indexToDelete = scanner.nextInt() - 1;
		scanner.nextLine();
		
		if (indexToDelete >= 0 && indexToDelete < carLot.size()) {
			
			System.out.println(carLot.get(indexToDelete).toString());
			System.out.println("Do you wish to purchase this car? (Y/N)");
			
			
			if (scanner.nextLine().equalsIgnoreCase("Y")) {
				carLot.remove(indexToDelete);
			} 
			
			initiateCarStore(carLot, scanner);
			} else {
				System.out.println("----------------------------");
				System.out.println("Please, enter a valid number");
				System.out.println("----------------------------");
				initiateCarStore(carLot, scanner);
			}
	}


}
