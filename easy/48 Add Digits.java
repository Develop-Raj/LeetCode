class Solution {
    public int addDigits(int num){
        if(num < 10){
            return num;
        }
    
        while(num>9){
           num = sum(num);
        }
        return num;
    }
    public int sum(int num){
        int sum = 0;
        while(num != 0){
            sum = sum + num%10;
            num/=10;
        }
        return sum;
    }
}
