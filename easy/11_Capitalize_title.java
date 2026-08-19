// first solution

class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String[] arr = title.split(" ");
        StringBuilder l = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            int len = arr[i].length();
            if(len > 2){
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
            }
            if(i != 0) l.append(" ");
            l.append(arr[i]);
        }
        return l.toString();
    }
}
