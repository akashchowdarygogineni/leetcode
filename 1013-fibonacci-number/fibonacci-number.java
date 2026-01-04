class Solution {
    public int fib(int n) {
        
        if(n<=1)
        {
            return n;
        }

        int secondlast=0;
        int last=1;

        int total=0;

        for(int i=2;i<=n;i++)
        {
            total=last+secondlast;
            secondlast=last;
            last=total;
        }
        return total;
    }
}