class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> duplication = new HashMap<>();
    
    boolean foundDupe = false;
        
    for(int i = 0; i < nums.length; i++){
        
        int key = nums[i];
        
        if(duplication.containsKey(key)){
            foundDupe = true;
        }else{
        duplication.put(key, 1);}     
        }
        
             return foundDupe;
    }
}