class Solution {
    public boolean isHappy(int n) {
        while(n != 1 && n != 4){
            n = process(n);
        }
        return n == 1;
    }
    public int process(int num){
        int result = 0;
        while(num!= 0){
            int a = num % 10;
            result = result + a*a;
            num /= 10;
        }
        return result;
    }
}
