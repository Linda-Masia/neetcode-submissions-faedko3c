class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int head = 0;
        int tail = numbers.length -1;
        while(numbers[head] + numbers[tail] != target && tail > head){
            if(numbers[head] + numbers[tail] > target){
                tail--;
            }else{
                head++;
            }
           
        }

        return new int[] {head + 1, tail + 1};
    }
}
