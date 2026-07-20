class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> li=new ArrayList<>();
        if(s.length()<p.length())
        {
            return li;
        }
   

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<p.length();i++)
        {
            char ch = p.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }


        //fixed window

        int left = 0;
        int right = p.length()-1;

         HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=left;i<=right;i++)
        {
           char ch1 = s.charAt(i);

           if(!map1.containsKey(ch1))
           {
            map1.put(ch1,1);
           }

           else{
            map1.put(ch1,map1.get(ch1)+1);
           }
        }

        if(map.equals(map1))
        {
            li.add(left);
        }

        while(right<s.length()-1)
        {
            map1.put(s.charAt(left),map1.get(s.charAt(left))-1);

            if(map1.get(s.charAt(left))==0)
            {
                map1.remove(s.charAt(left));
            }

            left++;
            right++;
            if(!map1.containsKey(s.charAt(right)))
            {
                 map1.put(s.charAt(right),1);
            }
            else{
                map1.put(s.charAt(right),map1.get(s.charAt(right))+1);
            }

            if(map1.equals(map))
            {
                li.add(left);
            }
           
        }


        return li;
    }
}