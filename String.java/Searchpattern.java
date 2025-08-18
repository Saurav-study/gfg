// Given two strings, one is a text string txt and the other is a pattern string pat. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices.
// Note: Return an empty list in case of no occurrences of pattern.

// Examples :

// Input: txt = "abcab", pat = "ab"
// Output: [0, 3]
// Explanation: The string "ab" occurs twice in txt, one starts at index 0 and the other at index 3. 
import java.util.ArrayList;
class Searchpattern {
    ArrayList<Integer> search(String pat, String txt) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=txt.length(),m=pat.length();
        if(m==0|| n<m) return res;
      int[] lps=new int[m];
      int len=0,i=1;
      while(i<m){
          if(pat.charAt(i)==pat.charAt(len)){
              lps[i++]=++len;
          }else if(len!=0){
              len = lps[len-1];
          }else{
              lps[i++]=0;
          }
      }
      int j=0;
      i=0;
      while(i<n){
          if(txt.charAt(i)==pat.charAt(j)){
              i++;j++;
              if(j==m){
                  res.add(i-m);
                  j=lps[j-1];
              }
              
          }else{
              if(j!=0){
                  j=lps[j-1];
              }else{
                  i++;
              }
          }
      }
      return res;
    }
}