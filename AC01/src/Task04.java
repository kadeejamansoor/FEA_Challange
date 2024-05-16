import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        scanner.close();
    }
}

