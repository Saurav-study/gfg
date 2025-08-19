// Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
// Note: You need to solve this problem without utilizing the built-in sort function.

// Examples:

// Input: arr[] = [0, 1, 2, 0, 1, 2]
// Output: [0, 0, 1, 1, 2, 2]
// Explanation: 0s 1s and 2s are segregated into ascending order.
class Solution {
    public void sort012(int[] arr) {
        // code here
        int n=arr.length;
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c0+=1;
            }else if(arr[i]==1){
                c1+=1;
            }else{
                c2+=1;
            }
        }
        int inx=0;
        for(int i=0;i<c0;i++){
            arr[inx++]=0;
        }
        for(int i=0;i<c1;i++){
            arr[inx++]=1;
        }
        for(int i=0;i<c2;i++){
            arr[inx++]=2;
        }
        
    }
}