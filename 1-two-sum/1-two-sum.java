class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    HashMap<Integer, Integer> twoSum = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
        int diff = target - nums[i];
        if(twoSum.containsKey(diff))
            return new int[]{twoSum.get(diff),i};
        twoSum.put(nums[i], i);
        }
        return new int[]{};
    }
}