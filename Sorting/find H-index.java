// You are given an array citations[], where each element citations[i] represents the number of citations received by the ith paper of a researcher. You have to calculate the researcher’s H-index.
// The H-index is defined as the maximum value H, such that the researcher has published at least H papers, and all those papers have citation value greater than or equal to H.

// Examples:

// Input: citations[] = [3, 0, 5, 3, 0]
// Output: 3
// Explanation: There are at least 3 papers with citation counts of 3, 5, and 3, all having citations greater than or equal to 3.
class find H-index{
    public int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        int[] count =new int[n+1];
        for(int c:citations){
            if(c>=n){
                count[n]++;
            }else{
                count[c]++;
                
            }
    }
    int total=0;
    for(int i=n;i>=0;i--){
        total+=count[i];
        if(total>=i){
            return i;
        }
    }
    return 0;
}
}