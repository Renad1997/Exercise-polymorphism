import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicles  = new ArrayList<>();

        Car car1 = new Car("Toyota Camry",5);
       Bike bike1 = new Bike("Mountain Bike",5);
      Truck truck1 = new Truck("",0);

        System.out.println("Welcome to Vehicle Rental System");
            boolean isChoose =true;
        System.out.println("1. Rent a Car");
        System.out.println("2. Rent a Bike");
        System.out.println("3. Rent a Truck");
        System.out.println("4. View Rented Vehicles");
        System.out.println("5. Exit");
           while(isChoose){
               System.out.print("Enter Your Choice :  ");
               int choice =input.nextInt();
            if(choice == 5){break;}
            if(choice < 5){
                switch(choice){
                    case 1:
                        System.out.println(rentedVehicles.add(car1));
                        System.out.println("Enter car Model: " +car1.getModel());
                        System.out.println("Enter Rental Days: " +car1.getDays());
                        System.out.println("Rental Details: ");
                         car1.displayDetails();
                        break;
                    case 2:
                        System.out.println(rentedVehicles.add(bike1));
                        bike1.displayDetails();
                        break;
                    case 3:
                        System.out.println("3. Rent a Truck");
                        break;
                    case 4:
                        System.out.println("4. View Rented Vehicles");
                        car1.displayDetails();
                        bike1.displayDetails();
                        break;
                    case 5:
                        System.out.println("Thank you for using the Vehicle Rental System!");
                        break;
                }


            }

                 }









       




    }
}