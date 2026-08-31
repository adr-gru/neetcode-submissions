class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int indexOne = 0; indexOne < nums.length; indexOne++){
            for(int indexTwo = indexOne + 1; indexTwo < nums.length; indexTwo++){
                if(nums[indexOne] + nums[indexTwo] == target){
                    return new int [] {indexOne,indexTwo};
                }
            }
        }
        return new int [] {0,0};
    }
}
