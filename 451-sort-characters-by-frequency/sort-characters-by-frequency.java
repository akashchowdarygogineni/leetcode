class Solution {
    public String frequencySort(String s) {
        
        //create the hashmap and store the each character frequency

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        
        //craete the list and place the all the charcteres in the lists
        List<Character> li=new ArrayList<>(map.keySet());
        
        //sort the charcters by the frequency (deccesrsing order)
        Collections.sort(li,(a,b)->map.get(b)-map.get(a));

        StringBuilder sb=new StringBuilder();

        for(char ch:li)
        {
            int k=map.get(ch);
            for(int i=1;i<=k;i++)
            {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
