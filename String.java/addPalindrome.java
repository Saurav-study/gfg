// Given a string s, the task is to find the minimum characters to be added at the front to make the string palindrome.

// Note: A palindrome string is a sequence of characters that reads the same forward and backward.

// Examples:

// Input: s = "abc"
// Output: 2
// Explanation: Add 'b' and 'c' at front of the above string to make it palindrome: "cbabc"
class addPalindrome {
    private int[] computeLPS(String str) {
        // code here
        int n=str.length();
        int [] lps=new int[n];
        int len=0;
        int i=1;
        while(i<n){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
                
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public int minChar(String s){
        String rev=new StringBuilder(s).reverse().toString();
        String combined =s + "$" + rev;
        int[]lps=computeLPS(combined);
        int longest=lps[lps.length-1];
        return s.length()-longest;
    }
}