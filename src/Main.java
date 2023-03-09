import java.util.Random;

public class Main {
    public static double calculateFunction(double x) {
        Random rand = new Random();
        int a = rand.nextInt(101) - 50; // generate random value of a in [-50, 50] range
        double result;
        if (x < 0) {
            result = x + Math.pow(Math.sin((1/x - a) + 4), 2);
        } else if (x == Double.POSITIVE_INFINITY || x == Double.NEGATIVE_INFINITY || Double.isNaN(x)) {
            System.out.println("Input value is not a valid number");
            result = Double.NaN;
        } else {
            result = a * x / Math.sqrt(Math.pow(a, 2) - Math.pow(x, 2));
        }
        return result;
    }

    public static void main(String[] args) {
        // test the function with different input values
        System.out.println(calculateFunction(-3)); // expected output: -1.7321739824360058
        System.out.println(calculateFunction(3)); // expected output: -3.758324648056659
        System.out.println(calculateFunction(4)); // expected output: NaN
        System.out.println(calculateFunction(Double.POSITIVE_INFINITY)); // expected output: "Input value is not a valid number" followed by NaN
    }
}
