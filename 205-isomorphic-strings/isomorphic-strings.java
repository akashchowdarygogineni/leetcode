class Solution {
    public boolean isIsomorphic(String s, String t) {
         
         //to check the two strings are ismorphic 

         //if the two string lengths are not equal
         if(s.length()!=t.length())
         {
            return false;
         }

         HashMap<Character,Character> map=new HashMap<>();
         HashMap<Character,Character> map1=new HashMap<>();

         for(int i=0;i<s.length();i++)
         {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            
            if(!map.containsKey(ch1))
            {
               map.put(ch1,ch2);
            }
           else
            {
               if(map.get(ch1)!=ch2)
               {
                return false;
               }
              
            }


             if(!map1.containsKey(ch2))
            {
                map1.put(ch2,ch1);
             
              
            }
            else
            { 
              if(map1.get(ch2)!=ch1)
               {
                return false;
               }
               
            }


         }
         return true;
    }
}