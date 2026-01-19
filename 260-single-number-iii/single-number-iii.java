class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }

        }
        
        ArrayList<Integer> li=new ArrayList<>();
        
        Set<Integer> s = map.keySet();
        
        for (int i : s) {
            if (map.get(i) %2!=0) {
                li.add(i);
            }
        }

        //th
       Collections.sort(li);
     

        int[] newarr=new int[li.size()];
        int k=0;
        for(int i:li)
        {
          newarr[k]=i;
          k++;
        }
   
        return newarr;
    }
}