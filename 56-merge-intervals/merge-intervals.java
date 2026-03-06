class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<List<Integer>> li=new ArrayList<>();

        //sort the given array
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int n=intervals.length;
       
       //strat that it is as the cuurent interval
        int i=0;

        while(i<n)
        {
          int start=intervals[i][0];
          int end=intervals[i][1];

          //placing towards the next interval and checking this is overlapping interval
          int j=i+1;

          while(j<n && intervals[j][0]<=end )
          {
            end=Math.max(end,intervals[j][1]);
            j++;
          }

          //then add the overlapping interval
          li.add(Arrays.asList(start,end));

          //placing these to the next non overlapping interval and conider these as the cuurrent interval
          i=j;
          
        }


        //after doing these add the all the list elements to the new array

        int[][] newarr=new int[li.size()][2];


        for(int k=0;k<li.size();k++)
        {
            newarr[k][0]=li.get(k).get(0);
            newarr[k][1]=li.get(k).get(1);
        }
        return newarr;

    }
}