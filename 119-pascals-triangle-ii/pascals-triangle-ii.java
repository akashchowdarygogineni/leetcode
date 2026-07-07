class Solution {
    public List<Integer> getRow(int r) {
       ArrayList<Integer> li=new ArrayList<>();
     if(r==0)
     {
        li.add(1);
        return li;
     }

    

      li.add(1);
      long res=1;
      for(int i=1;i<r;i++)
      {
        res=res*(r-i+1);
        res=res/i;
        li.add((int)res);
      }
      li.add(1);


      return li;
    }
}