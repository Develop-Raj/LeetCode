class Solution {
    public int maxPower(String s) {
        char[] arr = s.toCharArray();
        int max = 1, c = 1;
        for(int i = 0; i < s.length()-1; i++){
            if(arr[i] != arr[i+1]) max = 1;
            else max ++;

            if(c < max ){
                c = max;
            }
        }
        return c;
    }
}
