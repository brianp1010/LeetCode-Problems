import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        boolean found = true;
        
        if(s.length() != t.length()){
            
            found = false;
        }
        else
        {
            char arr1 [] = s.toCharArray();
            char arr2 [] = t.toCharArray();
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            found = Arrays.equals(arr1, arr2);
        }
        
        return found;
    }
}