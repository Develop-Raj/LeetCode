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

