class Solution {
    public boolean isPalindrome(int x) {
     if(0 > x) return false;
     int org = x;
     int c = 0;
     while(x != 0){
        int a = x % 10;
        c = c * 10 + a;
        x=x/10;
     }   
     if(org == c) return true;
     return false;
    }
}
