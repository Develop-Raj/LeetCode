class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int n : nums) {
            if (String.valueOf(n).length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
//2ms

class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;

        for (int n : nums) {
            if (check(n)) {
                c++;
            }
        }

        return c;
    }

    public boolean check(int n) {
        int digits = 0;

        while (n > 0) {
            digits++;
            n /= 10;
        }

        return digits % 2 == 0;
    }
}

//1ms
