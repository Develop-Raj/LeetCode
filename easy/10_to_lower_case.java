// -- my intital solution 
/*
class Solution {
    public String toLowerCase(String s) {
        String l = "";
        for(int i = 0;i< s.length(); i++){
            char ch = s.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z'){
                l += (char)(ch - 'A' + 'a');
            }
            else l += ch;
        }
        return l;
    }
} */ 

// second solution

/*

class Solution {
    public String toLowerCase(String s) {
        StringBuilder l = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch - 'A' + 'a');
            }

            l.append(ch);
        }

        return l.toString();
    }
}

*/
// BEST SOLUTION

import java.util.Scanner;

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
