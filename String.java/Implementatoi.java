class Impleementatoi {
    public int myAtoi(String s) {
        // code here
        int i=0,n=s.length();
        int sign=1;
        long result=0;
        while (i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<n&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            int digits =s.charAt(i)-'0';
            result=result*10+digits;
            if(sign==1&&result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1&&(-result)<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
        }
        i++;
        
    }
    return (int)(sign*result);
}
}