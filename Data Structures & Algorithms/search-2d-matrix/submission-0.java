class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Edge case check
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Treat the 2D matrix as a flat 1D array from index 0 to (rows * cols - 1)
        int startpoint = 0;
        int endpoint = (rows * cols) - 1;

        while (startpoint <= endpoint) {
            int midpoint = startpoint + (endpoint - startpoint) / 2;
            
            // Map the 1D midpoint back to 2D row and column coordinates
            int midValue = matrix[midpoint / cols][midpoint % cols];

            if (midValue == target) {
                return true;
            } 
            else if (midValue > target) {
                endpoint = midpoint - 1; // Target is in the left/upper half
            } 
            else {
                startpoint = midpoint + 1; // Target is in the right/lower half
            }
        }

        return false; // Target not found
    }
}