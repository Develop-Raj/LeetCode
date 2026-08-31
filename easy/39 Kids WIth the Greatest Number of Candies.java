class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int n = candies.length;
        for(int i = 0; i < n; i++ ){
            int c = 0;
            for(int j = 0; j <n; j++ ){
                c++;
                if(i == j) continue;
                if((candies[i] + extraCandies) < candies[j]){
                    result.add(false);
                    c--;
                    break;
                }
            }
            if(c == n) result.add(true);
        }
        return result;
    }
}

// 2ms 
