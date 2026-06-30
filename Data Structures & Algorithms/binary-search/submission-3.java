class Solution {
    public int search(int[] nums, int target) {
        // Handle empty array edge case
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int startpoint = 0;
        int endpoint = nums.length - 1; // Make endpoint inclusive

        while (startpoint <= endpoint) {
            // Safe way to find the middle without integer overflow
            int midpoint = startpoint + (endpoint - startpoint) / 2;

            if (nums[midpoint] == target) {
                return midpoint;
            } 
            else if (nums[midpoint] > target) {
                endpoint = midpoint - 1; // Target is in the left half
            } 
            else {
                startpoint = midpoint + 1; // Target is in the right half
            }
        }

        return -1; // Target not found
    }
}