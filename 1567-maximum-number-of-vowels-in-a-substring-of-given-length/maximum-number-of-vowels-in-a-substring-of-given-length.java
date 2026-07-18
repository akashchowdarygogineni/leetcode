class Solution {
    public int maxVowels(String s, int k) {
      
      //first try to compute the no of characters in the window1
      int left=0;
      int right=k-1;

      int vowelcount=0;

      for(int i=left;i<=right;i++)
      {
        char ch=Character.toLowerCase(s.charAt(i));
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
         {
            vowelcount++;
         }
      }
      int maxcount=vowelcount;


      while(right<s.length()-1)
      {
        char ch=Character.toLowerCase(s.charAt(left));
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            vowelcount--;
        }
        left++;
        right++;
        char ch1=Character.toLowerCase(s.charAt(right));
        if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
        {
            vowelcount++;
        }

        if(vowelcount>maxcount)
        {
            maxcount=vowelcount;
        }

      }

      return maxcount;
    }
}