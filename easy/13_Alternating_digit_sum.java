class Solution {
    public int alternateDigitSum(int n) {
        int divisor = 1;

        while (n / divisor >= 10) {
            divisor *= 10;
        }

        int result = 0;
        int sign = 1;

        while (divisor > 0) {
            result += sign * (n / divisor);
            n %= divisor;
            divisor /= 10;
            sign *= -1;
        }

        return result;
    }
}
