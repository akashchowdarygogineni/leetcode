class Solution {
    public static List<Integer> generaterow(int r){
            ArrayList<Integer> li=new ArrayList<>();

       if(r==1)
       {
        li.add(1);
        return li;
       }

   
       li.add(1);

       int res=1;

       for(int i=1;i<r-1;i++)
       {
        res=res*(r-i);

        res=res/i;
        li.add(res);
       }
       li.add(1);

       return li;
    }

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> li1=new ArrayList<>();

      for(int i=1;i<=n;i++)
      {
        li1.add(generaterow(i));
      }

      return li1;
    }
}