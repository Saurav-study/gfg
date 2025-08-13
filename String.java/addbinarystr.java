// Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
// Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

// Input: s1 = "1101", s2 = "111"
// Output: 10100
// Explanation:
//  1101
// + 111
// 10100
class addbinarystr {
    public String addBinary(String s1, String s2) {
        // code here
        int i=s1.length()-1;
          int j=s2.length()-1;
          int carry=0;
          String ans="";
          while(i>=0 || j>=0 || carry>0){
              int bit1=(i>=0)?s1.charAt(i)-'0':0;
               int bit2=(j>=0)?s2.charAt(j)-'0':0;
               int sum=bit1+bit2+carry;
               ans=(sum%2)+ans;
               carry=sum/2;
               i--;
               j--;
               
          }
        ans=ans.replaceFirst("^0+(?!$)","");
        return ans;
    }
}