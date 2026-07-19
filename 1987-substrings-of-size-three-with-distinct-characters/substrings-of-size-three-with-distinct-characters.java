class Solution {
    public int countGoodSubstrings(String s) {
         int k=3;
       if (s.length() < k)
        {
        return 0;
        }
        int count=0;
       

        int left=0;
        int right=k-1;

         HashMap<Character,Integer> map=new HashMap<>();
        for(int i=left;i<=right;i++)
        {
           if(!map.containsKey(s.charAt(i)))
           {
            map.put(s.charAt(i),1);
           }
           else{
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
           }
        }

        if(map.size()==k)
        {
            count++;
        }


        while(right<s.length()-1)
        {
            char ch=s.charAt(left);
            map.put(ch,map.get(ch)-1);

            if(map.get(ch)==0)
            {
                map.remove(ch);
            }
            left++;

            right++;

            char ch1=s.charAt(right);

            if(!map.containsKey(ch1))
            {
                map.put(ch1,1);

            }
            else{
                map.put(ch1,map.get(ch1)+1);
            }

            if(map.size()==k)
            {
                count++;
            }
        }


        return count;
    }
}