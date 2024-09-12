package Easy;



public class CountingBits {
    public static int[] countBits(int n) {
        int[] result = new int[n + 1]; // Array to store results for numbers 0 to n

        for (int i = 0; i <= n; i++) {
            int count = 0;
            int num = i; // Use a copy of i to perform the bit operations

            while (num > 0) {
                if ((num & 1) != 0) { // Check if the last bit is 1
                    count++;
                }
                num = num >> 1; // Shift right to check the next bit
            }
            
            result[i] = count; // Store the count of 1s in the result array
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        int[] result = countBits(n);

        // Print the result
        for (int i = 0; i <= n; i++) {
            System.out.print(result[i]+ " ");
        }
    }
}
