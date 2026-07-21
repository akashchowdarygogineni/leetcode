class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        //optimal approach
        if(s.equals(""))
        {
            return 0;
        }
        int left=0;
        int right=0;

        int maxlen=Integer.MIN_VALUE;
        int[] hasharr=new int[256];

        Arrays.fill(hasharr,-1);

        

        while(right<s.length())

        {
            //if it is not valid
            if(hasharr[s.charAt(right)]!=-1)
            {
                if(hasharr[s.charAt(right)]>=left)
                {
                    left=hasharr[s.charAt(right)]+1;
                }
            }

            int len=right-left+1;

            maxlen=Math.max(maxlen,len);
            hasharr[s.charAt(right)]=right;
            right++;
        }

        return maxlen;
    }
}