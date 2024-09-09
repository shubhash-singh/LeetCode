class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SpiralMatrixIV {

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        // Create an m x n matrix initialized with -1
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        // Initialize boundaries
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        // Traverse the linked list and fill the matrix in spiral order
        ListNode current = head;
        while (top <= bottom && left <= right && current != null) {
            // Fill the top row
            for (int i = left; i <= right && current != null; i++) {
                matrix[top][i] = current.val;
                current = current.next;
            }
            top++;

            // Fill the right column
            for (int i = top; i <= bottom && current != null; i++) {
                matrix[i][right] = current.val;
                current = current.next;
            }
            right--;

            // Fill the bottom row (if applicable)
            if (top <= bottom) {
                for (int i = right; i >= left && current != null; i--) {
                    matrix[bottom][i] = current.val;
                    current = current.next;
                }
                bottom--;
            }

            // Fill the left column (if applicable)
            if (left <= right) {
                for (int i = bottom; i >= top && current != null; i--) {
                    matrix[i][left] = current.val;
                    current = current.next;
                }
                left++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        // Matrix dimensions
        int m = 3, n = 4;

        // Generate the spiral matrix
        int[][] matrix = spiralMatrix(m, n, head);

        // Print the matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
