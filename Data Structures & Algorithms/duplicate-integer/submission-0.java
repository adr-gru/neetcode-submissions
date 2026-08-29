class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int counter = 0; counter < nums.length; counter++){
            if(numbers.contains(nums[counter])){
                {
                    return true;
                } 
            } else{
                numbers.add(nums[counter]);
            }
           
        }
        return false;

    }
}