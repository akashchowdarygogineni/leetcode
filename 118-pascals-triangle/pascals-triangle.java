class Solution {
    public static List<Integer> generaterow(int r){
        List<Integer> li=new ArrayList<>();

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

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> pascaltriangle=new ArrayList<>();

        //compute each row 

        for(int i=1;i<=n;i++)
        {
            pascaltriangle.add(generaterow(i));
        }
        return pascaltriangle;
    }
}