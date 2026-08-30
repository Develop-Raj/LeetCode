class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int h = (day + (13 * (month + 1)) / 5 + year%100 + (year%100) / 4 + year / 400 + 5 * (year/100)) % 7;
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday"};
        return days[h];
    }
}
