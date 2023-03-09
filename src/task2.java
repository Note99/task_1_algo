import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        // Create an array of real numbers
        double[] arr = {1.5, 2.7, 3.2, 4.8, 5.9, 6.1, 7.0, 8.6, 9.4, 10.0};

        // Take input for elements of array within a range
        inputElements(arr, 2, 7);

        // Print the array
        for (double d : arr) {
            System.out.print(d + " ");
        }
    }

    // Method to take input for elements of array within a range
    public static void inputElements(double[] arr, int k1, int k2) {

        Scanner sc = new Scanner(System.in);

        for (int i = k1; i <= k2; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr[i] = sc.nextDouble();
        }

        sc.close();
    }
}
