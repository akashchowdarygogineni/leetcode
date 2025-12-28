class Solution {
    
    public static long mincostFunction(int[] cost,String s,char ch)
    {
        long sum=0;
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==ch)
                {
                    continue;
                }
                else{
                    sum+=cost[i];
                }
            }
        return sum;
    }
    public long minCost(String s, int[] cost) {
        
        HashSet<Character> set=new HashSet<>();

        long low=Long.MAX_VALUE;

        for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);

                if(!set.contains(ch))
                {
                    
                    set.add(ch);
                    //function call

                    long r=mincostFunction(cost,s,ch);
                     low=Math.min(low,r);
                }
                else{
                    continue;
                }

            }
        return low;


    }
}