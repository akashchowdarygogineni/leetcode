class Solution {
    public int[] rearrangeArray(int[] nums) {
        
       
       //rearranging th eleent sby the sign 

       int n=nums.length;


       int[] newarr=new int[n];

       int[] pos=new int[n/2];
       int[] neg=new int[n/2];
   

       int k=0;
       int m=0;

       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>0)
        {
            pos[k]=nums[i];
            k++;
        }
        else{
            neg[m]=nums[i];
            m++;
        }
       }
      




       for(int p=0;p<n/2;p++)
       {
        newarr[2*p]=pos[p];
        newarr[2*p+1]=neg[p];
       }

      return newarr;
    }
}