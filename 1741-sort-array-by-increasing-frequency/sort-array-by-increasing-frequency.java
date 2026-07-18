class Solution {
    public int[] frequencySort(int[] nums) {

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
        Collections.sort(li,(a,b)->{
            if(a.getValue()!=b.getValue())
            {
                return Integer.compare(a.getValue(),b.getValue());
            }
            else{
                return Integer.compare(b.getKey(),a.getKey());
            }
        });



       
        int[] newarr=new int[nums.length];
        int m=0;
        for(Map.Entry<Integer,Integer> tr:li)
        {
           for(int k=0;k<tr.getValue();k++)
           {
             newarr[m]=tr.getKey();
             m++;
           }
        }
        
      return newarr;
       
    }
}