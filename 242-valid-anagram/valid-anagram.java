class Solution {
    public boolean isAnagram(String s, String t) {



        
           if(s.length()!=t.length())
        {
            return false;
        }

        HashMap<Character,Integer> map1=new HashMap<>();
        
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=t.charAt(i);
            if(!map1.containsKey(ch))
            {
                map1.put(ch,1);
            }
            else{
                map1.put(ch,map1.get(ch)+1);
            }

            char ch1=s.charAt(i);
            if(!map2.containsKey(ch1))
            {
                map2.put(ch1,1);
            }
            else{
                map2.put(ch1,map2.get(ch1)+1);
            }
        }


      
        return map1.equals(map2);
    }
}