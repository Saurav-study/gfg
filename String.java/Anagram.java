// Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
// Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

// Examples:

// Input: s1 = "geeks" s2 = "kseeg"
// Output: true 
// Explanation: Both the string have same characters with same frequency. So, they are anagrams.
class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())
            return false;
       int[] count=new int[26];
       for(int i=0;i<s1.length();i++){
           count[s1.charAt(i) -'a']++;
           count[s2.charAt(i) -'a']--;
           
       }
       for(int c:count){
           if(c!=0)
               return false;
       }
           return true;
       }
        
    }
