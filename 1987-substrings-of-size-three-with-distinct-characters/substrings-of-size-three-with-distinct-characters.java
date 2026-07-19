class Solution {
    public int countGoodSubstrings(String s) {
        

        int count=0;
        int k=3;

        int n=s.length();

        for(int i=0;i<=n-k;i++)
        {
           HashSet<Character> set=new HashSet<>();
           for(int j=i;j<i+k;j++)
           {
              set.add(s.charAt(j));
           }

           if(set.size()==k)
           {
             count++;
           }
        }

        return count;
    }
}