class Solution {
    public List<Integer> getRow(int rowIndex) {

        int r=rowIndex+1;
        ArrayList<Integer> li=new ArrayList<>();

        long res=1;
        li.add((int)res);
        for(int i=1;i<r;i++)

        {
            res=res*(r-i);
            res=res/i;
            li.add((int)res);
        }

        return li;
    }
}