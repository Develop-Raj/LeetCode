class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;

        for (int n : nums) {
            sum += encrypt(n);
        }

        return sum;
    }

    public int encrypt(int n) {
        int max = 0;
        int c = 0;
        int result = 0;

        while (n != 0) {
            c++;
            max = Math.max(max, n % 10);
            n /= 10;
        }

        while (c != 0) {
            result = result * 10 + max;
            c--;
        }

        return result;
    }
}
