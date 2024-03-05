class Solution {
    public int bagOfTokensScore(int[] arr, int p) {
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        int maxScore=0,currScore=0;

        while(i<=j){
            if(p>=arr[i]){
                currScore++;
                p-=arr[i++];
            }
            else {
                currScore--;
                p+=arr[j--];
            }
            if(currScore<0)  break;
            maxScore = Math.max(maxScore,currScore);

        }
        return maxScore;
    }
}