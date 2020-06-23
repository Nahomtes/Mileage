import java.util.Scanner;

public class Mileage {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter traveled miles: ");
        double traveledMiles = scanner.nextDouble();

        System.out.println("Enter gallons: ");
        double usedGallons = scanner.nextDouble();

        double mileage = traveledMiles / usedGallons;

        System.out.println("The result is %2f" + mileage + " miles/gallon");

    }
}
