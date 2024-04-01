class Solution {
    public boolean solution(int x) {
        int digit = 0;
        for(int i = x; i!=0; i /= 10)
            digit = digit + (i % 10);
        
        if(x%digit == 0) return true;
        else return false;
    }
}