public class MAXELEMENT {

    public static void main(String[] args) {
        // Input matrix
        int[][] matrix = {
                {5, 3},
                {9, 7}
        };

        // Function call to find the maximum element
        int maxElement = findMax(matrix);

        // Output the result
        System.out.println("Maximum Element in the Matrix: " + maxElement);
    }

    public static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE; // Initialize max with the smallest value

        // Traverse through the matrix
        for (int[] row : matrix) {
            for (int element : row) {
                // Update max if the current element is greater
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
