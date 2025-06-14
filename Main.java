public class Main {
    public static void main(String[] args) {
        int divisor = 25;
        int result = 0;

        try {
            result = 50 / divisor;
            if (result < 3) {
                throw new ArithmeticException("Result too small to be accepted");
            }
        } catch (ArithmeticException e) {
            result = 50 / 2; // fallback jika hasil terlalu kecil
            System.out.println("Using fallback value. Reason: " + e.getMessage());
        }

        System.out.println("Final result: " + result);
        System.out.println("Program finished successfully.");
    }
}
