// Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.

// Examples:

// Input: s = "geeksforgeeks"
// Output: 'f'
// Explanation: In the given string, 'f' is the first character in the string which does not repeat.
class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int []f=new int[26];
        for(int i=0;i<s.length();i++)
            f[s.charAt(i) - 'a']++;
            for(int i=0;i<s.length();i++)
         if(f[s.charAt(i) - 'a']==1) return s.charAt(i);
         return'$';
        }
    }