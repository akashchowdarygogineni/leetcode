class Solution {
    public boolean isAnagram(String s, String t) {



        
       if(s.length()!=t.length())
       {
        return false;
       }
      
       //hasharray of first String and second string
       int[] hasharr=new int[26];
       int[] hasharr1=new int[26];

       for(int i=0;i<s.length();i++)
       {
         hasharr[s.charAt(i)-'a']+=1;
         hasharr1[t.charAt(i)-'a']+=1;
       }

       for(int i=0;i<=25;i++)
       {
         if(hasharr[i]!=hasharr1[i])
         {
            return false;
         }
       }
       return true;
    }
}