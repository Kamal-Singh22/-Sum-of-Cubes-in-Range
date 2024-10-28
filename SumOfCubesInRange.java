public class SumOfCubesInRange {

    // Function to calculate the sum of cubes from M to N
    public static int sumOfCubes(int M, int N) {
        if (M > N) {
            System.out.println("Invalid range: M is greater than N.");
            return 0;
        }

        int sum = 0;
        for (int i = M; i <= N; i++) {
            sum += Math.pow(i, 3); // Add cube of i to sum
        }

        return sum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int M = 5;
        int N = 10;
        int result = sumOfCubes(M, N);
        System.out.println("Sum of cubes from " + M + " to " + N + " is: " + result);
    }
}
