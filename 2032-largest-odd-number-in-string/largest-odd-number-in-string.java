class Solution {
    public String largestOddNumber(String num) {
        
        int j=-1;
        for(int i=num.length()-1;i>=0;i--)
        {
            if((num.charAt(i)-'0')%2!=0)
            {
                j=i;
                break;
            }
        }

        if(j==-1)
        {
            return "";
        }
        
        int k=-1;
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i)!='0')
            {
                k=i;
                break;
            }
        }

        return num.substring(k,j+1);
    }
}