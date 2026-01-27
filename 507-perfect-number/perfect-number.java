class Solution {
    public boolean checkPerfectNumber(int n) {
        int sum=0;
        int temp=n;
        
        for(int i=1;i<n;i++)
        {
           
            if(n%i==0)
            {
                sum+=i;
            }
        
            
        }

        if(temp==sum)
        {
            return true;
        }
        return false;
    }
}