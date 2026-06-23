class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> h = new HashSet<Integer>();

        for(int i =0; i<nums.length;i++){
            if(!h.contains(nums[i])){
                 h.add(nums[i]);
            }else{
                return true;
            }
        }

         return false;
       
    }
}