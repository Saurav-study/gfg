// You are given two strings s1 and s2, of equal lengths. The task is to check if s2 is a rotated version of the string s1.

// Note: A string is a rotation of another if it can be formed by moving characters from the start to the end (or vice versa) without rearranging them.

// Examples :

// Input: s1 = "abcd", s2 = "cdab"
// Output: true
// Explanation: After 2 right rotations, s1 will become equal to s2.
class Solution {
    public boolean areRotations(String s1, String s2) {
        // code here
   if(s1.length()!=s2.length())return false;
   String temp=s1+s1;
   return kmpSearch(temp,s2);
    }

private boolean kmpSearch(String text,String pattern){
    int n=text.length(),m=pattern.length();
    int[]lps=buildLPS(pattern);
    int i=0,j=0;
    while(i<n){
        if(text.charAt(i)==pattern.charAt(j)){
            i++;
            j++;
            if(j==m)return true;
        }else{
            if(j!=0){
                j=lps[j-1];
            }else{
            i++;
            
        }
    }
}
return false;
}
private int[] buildLPS(String pat){
    int m=pat.length();
    int [] lps=new int[m];
    int len=0,i=1;
    while(i<m){
        if(pat.charAt(i)==pat.charAt(len)){
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
}