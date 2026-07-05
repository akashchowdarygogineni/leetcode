class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           ArrayList<Integer> li=new ArrayList<>();
      
       Arrays.sort(nums1);
       Arrays.sort(nums2);

       int i=0;
       int j=0;
       

       //for the worst case consider the time complexity is o(n1+n2) when you take the odd array and even array exampl

       //for coming to the space complexity for the worst case its should be like we will store all the matching elements it shpuld be O(min(n1,n2))


       while(i<nums1.length && j<nums2.length)
       {
         if(nums1[i]<nums2[j])
         {
            i++;
         }
         else if(nums2[j]<nums1[i])
         {
            j++;
         }
         else{
             
             if(li.size()==0 || li.get(li.size()-1)!=nums1[i])
             {
            li.add(nums1[i]);
           
             }
              i++;
            j++;
         }
       }

       int[] intersection_arr=new int[li.size()];
       int k=0;

       for(int m:li)
       {
        intersection_arr[k]=m;
        k++;

       }


       return intersection_arr;
    }

       
    
}