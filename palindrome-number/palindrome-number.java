class Solution {
    public boolean isPalindrome(int x) {
        
    int temp, remainder, reversed = 0;
    temp = x;
        
    while(x >= 1)
    {
        remainder = x % 10;
        x = x / 10;
        reversed = reversed * 10 + remainder;
    }
        
    return temp == reversed;

    }
}