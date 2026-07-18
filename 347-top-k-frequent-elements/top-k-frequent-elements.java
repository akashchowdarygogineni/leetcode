class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map1=new HashMap<>();
     
        
        for(int i:nums)
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

        List<Map.Entry<Integer,Integer>> li=new ArrayList<>(map1.entrySet());


        //now we need to sort the data in the map
        Collections.sort(li,(a,b)->Integer.compare(b.getValue(),a.getValue()));

        
        ArrayList<Integer> li1=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
          li1.add(li.get(i).getKey());
        }


        int[] newarr=new int[li1.size()];
        int m=0;
        for(int i:li1)
        {
            newarr[m]=i;
            m++;
        }

        return newarr;
    
    }
}