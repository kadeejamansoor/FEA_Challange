import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        double average = (double) sum / 2;

        int max = Math.max(num1, num2);

        int min = Math.min(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        scanner.close();
    }
}
