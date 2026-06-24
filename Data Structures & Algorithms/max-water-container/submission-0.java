class Solution {

    public int maxArea(int[] heights) {
        // 1. Initialize pointers at the far ends
        int left = 0;
        int right = heights.length - 1; 
        
        int bestVol = 0;
        // Keeping track of the best pair indices (if needed for tracking)
        int[] bestPair = new int[] {0, 0}; 

        while (left < right) {
            // 2. Calculate the width and the limiting height
            int width = right - left;
            int shortest = Math.min(heights[left], heights[right]);
            int currVol = width * shortest;

            // 3. Update maximum volume if we found a better one
            if (currVol > bestVol) {
                bestVol = currVol;
                bestPair = new int[] {left, right};
            }

            // 4. Move the pointer pointing to the shorter line inward
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        // 5. Return the maximum volume found
        return bestVol;
    }
}