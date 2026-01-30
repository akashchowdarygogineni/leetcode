class Solution
 {
    public boolean checkDivisibility(int n)
     {
        int mul=1;
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int r=n%10;

            mul=mul*r;
            sum=sum+r;
            n=n/10;

        }
        int s=mul+sum;
        return temp%s==0;
    }
}