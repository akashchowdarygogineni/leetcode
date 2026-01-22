class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        //we are doing the three sum of the arrays


        List<List<Integer>> li=new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }

            int j=i+1;
            int k=arr.length-1;

            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k]>0)
                {
                    k--;
                }
                else if(arr[i]+arr[j]+arr[k]<0)
                {
                    j++;
                }
                else{
                   ArrayList<Integer> li1=new ArrayList<>();
                   li1.add(arr[i]);
                   li1.add(arr[j]);
                   li1.add(arr[k]);
                   li.add(li1);
                   j++;
                   k--;

                   while(j<k && arr[j-1]==arr[j])
                   {
                    j++;

                   }
                   while(j<k && arr[k]==arr[k+1])
                   {
                    k--;
                   }
                }
            }

          
        }
          return li;
 
    }
}