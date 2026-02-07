class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n=cardPoints.length-1;
        int maxsum=0;
        int leftsum=0;
        for(int i=0;i<k;i++)
        {
           leftsum+=cardPoints[i];
        }
        maxsum=leftsum;

        int rightsum=0;
        for(int j=k-1;j>=0;j--)
        {
            leftsum=leftsum-cardPoints[j];
            rightsum=rightsum+cardPoints[n];
            maxsum=Math.max(maxsum,leftsum+rightsum);
            n--;


        }
        return maxsum;
    }
}