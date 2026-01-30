class Solution {
    public boolean checkStraightLine(int[][] points) {
        
         int x1=points[0][0];
        int y1=points[0][1];

        int x2=points[1][0];
        int y2=points[1][1];

        for(int i=2;i<points.length;i++)
        {
            int x3=points[i][0];
            int y3=points[i][1];

            if((x2-x1)*(y3-y1)==(y2-y1)*(x3-x1))
            {
                
            }
            else{
                return false;
            }

        }
        return true;
    }
}