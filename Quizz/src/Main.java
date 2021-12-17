import java.util.Scanner;

public class Main {
public static void main(String[] args) {

		

		Scanner scanner = new Scanner(System.in);

		

		String[] carInput = scanner.nextLine().split(" ");

		//TODO - create car Object;
		Car myCar = new Car();
		

		String[] truckInput = scanner.nextLine().split(" ");

		//TODO - create truck object
		Truck myTruck = new Truck();

		

		int n = Integer.parseInt(scanner.nextLine());

		

		for (int i = 0; i < n; i++) {

			String[] action = scanner.nextLine().split(" ");

			if(action[0].equals("Drive")) {

				if(action[1].equals("Car")) {

					myCar.drive(i);

				}

				if(action[1].equals("Truck")) {

					myTruck.drive(i);

				}

			} 

			if (action[0].equals("Refuel")) {

				if(action[1].equals("Car")) {

					myCar.refuel(i, i);

				}

				if(action[1].equals("Truck")) {

					myTruck.refuel(i, i);

				}

			}		

		}	

		//TODO - print in following format "Car: {liters}

										  //Truck: {liters}
		
		System.out.println("Car: " );
		System.out.println("Truck: " + kmDriven );

	}
}
