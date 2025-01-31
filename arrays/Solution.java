class Solution {
    public void setZeroes(int[][] matrix) {
        boolean fr = false, fc = false; // Flags for first row and first column

        // Step 1: Mark rows and columns to be zeroed
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) fr = true; // Mark first row
                    if (j == 0) fc = true; // Mark first column
                    matrix[i][0] = 0;      // Mark the row
                    matrix[0][j] = 0;      // Mark the column
                }
            }
        }

        // Step 2: Use the marks to set the appropriate elements to zero
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0; // Set element to zero if row or column is marked
                }
            }
        }

        // Step 3: Set the first row to zero if needed
        if (fr) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Set the first column to zero if needed
        if (fc) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Input matrix
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Call the method to set zeroes
        sol.setZeroes(matrix);
        
        // Print modified matrix
        System.out.println("Modified Matrix:");
        printMatrix(matrix);
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        
        }
        
    }
}
