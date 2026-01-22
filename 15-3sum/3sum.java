class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        //we are doing the three sum of the arrays

         Set<List<Integer>> s=new HashSet<>();
        for(int i=0;i<arr.length-2;i++)
        {
            HashSet<Integer> s1=new HashSet<>();
            for(int j=i+1;j<arr.length;j++)
            {
                int k=-(arr[i]+arr[j]);
             
                    if(s1.contains(k))
                    {  
                    List<Integer> li=new ArrayList<>();

                    li.add(arr[i]);
                    li.add(arr[j]);
                    li.add(k);
                    Collections.sort(li);
                    s.add(li);
                    }
                    s1.add(arr[j]);
                
            }
        }

        List<List<Integer>> ans=new ArrayList<>();

        for(List<Integer> i:s)
        {
            ans.add(i);
        }
        return ans;
    }
}