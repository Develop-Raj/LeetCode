class Solution {
    public int[] getConcatenation(int[] nums) {
        int s = nums.length;
        int[] result = new int[s*2];
        int c = 0;
        for(int i = 0; i< 2; i++){
            for(int j = 0; j < s; j++){
                result[c] = nums[j];
                c++;
            }
        }
        return result;
    }
}
