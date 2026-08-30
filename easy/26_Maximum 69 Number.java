class Solution {
    public int maximum69Number(int num) {
        List<Integer> number = new ArrayList<Integer>();

        while (num != 0) {
            number.add(num % 10);
            num /= 10;
        }

        for (int i = number.size() - 1; i >= 0; i--) {
            if (number.get(i) == 6) {
                number.set(i, 9);
                break;
            }
        }
        int max = 0;
        for (int i = number.size() - 1; i >= 0; i--) {
            max = max * 10 + number.get(i);
        }

        return max;
    }
}
