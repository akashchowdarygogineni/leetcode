class Solution {
    public String frequencySort(String s) {
        
        
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


    List<Map.Entry<Character,Integer>> li=new ArrayList<>(map.entrySet());


    Collections.sort(li,(a,b)->(b.getValue()-a.getValue()));

    StringBuilder sb=new StringBuilder();

    for(Map.Entry<Character,Integer> tr:li)

    {
        for(int i=0;i<tr.getValue();i++)
        {
            sb.append(tr.getKey());
        }
      
    }

    return sb.toString();
    }
}
