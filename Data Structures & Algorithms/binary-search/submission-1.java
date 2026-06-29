class Solution {
    public int search(int[] nums, int target) {
        // Base case: empty array means target wasn't found
        if (nums == null || nums.length == 0) return -1;

        int mid = (nums.length - 1) / 2;

        if (nums[mid] == target) {
            return mid; // Target found!
        } 
        
        if (nums[mid] < target) {
            // Search the right half
            int[] rightHalf = Arrays.copyOfRange(nums, mid + 1, nums.length);
            int result = search(rightHalf, target);
            
            // If found in the sub-array, adjust the index back to the original array's perspective
            return (result == -1) ? -1 : mid + 1 + result;
        } else {
            // Search the left half
            int[] leftHalf = Arrays.copyOfRange(nums, 0, mid);
            return search(leftHalf, target);
        }
    }
}