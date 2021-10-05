class Solution {
    public int reverse(int x) {
        
        int remainder, reversed = 0;
            
        while(x !=0)
        {
            remainder = x % 10;
            x = x / 10;
            
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && remainder > 7)) 
                return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && remainder < -8)) 
                return 0;
            
            reversed = reversed * 10 + remainder;
        }  
        return reversed;
    }
}