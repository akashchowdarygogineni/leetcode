class Solution {
    public List<String> topKFrequent(String[] nums, int k) {
        
         HashMap<String,Integer> map1=new HashMap<>();
     
        
        for(String i:nums)
        {
            if(!map1.containsKey(i))
            {
                map1.put(i,1);
            }
            else{
                map1.put(i,map1.get(i)+1);
            }
        }
        
        

        //we need to set the proirty fro these

        List<Map.Entry<String,Integer>> li=new ArrayList<>(map1.entrySet());


        //now we need to sort the data in the map
        Collections.sort(li,(a,b)->{
            if(a.getValue()!=b.getValue())
            {
                return Integer.compare(b.getValue(),a.getValue());
            }
            else{
                return a.getKey().compareTo(b.getKey());
            }
        });


        ArrayList<String> li1=new ArrayList<>();

        for(int i=0;i<k;i++)
        {
            li1.add(li.get(i).getKey());
        }
        
       

        return li1;

    }
}