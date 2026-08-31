class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> value = new ArrayList<String>();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0) value.add("FizzBuzz");
            else if(i % 3 == 0) value.add("Fizz");
            else if(i % 5 == 0) value.add("Buzz");
            else value.add(String.valueOf(i));
        }
        return value;
    }
}
