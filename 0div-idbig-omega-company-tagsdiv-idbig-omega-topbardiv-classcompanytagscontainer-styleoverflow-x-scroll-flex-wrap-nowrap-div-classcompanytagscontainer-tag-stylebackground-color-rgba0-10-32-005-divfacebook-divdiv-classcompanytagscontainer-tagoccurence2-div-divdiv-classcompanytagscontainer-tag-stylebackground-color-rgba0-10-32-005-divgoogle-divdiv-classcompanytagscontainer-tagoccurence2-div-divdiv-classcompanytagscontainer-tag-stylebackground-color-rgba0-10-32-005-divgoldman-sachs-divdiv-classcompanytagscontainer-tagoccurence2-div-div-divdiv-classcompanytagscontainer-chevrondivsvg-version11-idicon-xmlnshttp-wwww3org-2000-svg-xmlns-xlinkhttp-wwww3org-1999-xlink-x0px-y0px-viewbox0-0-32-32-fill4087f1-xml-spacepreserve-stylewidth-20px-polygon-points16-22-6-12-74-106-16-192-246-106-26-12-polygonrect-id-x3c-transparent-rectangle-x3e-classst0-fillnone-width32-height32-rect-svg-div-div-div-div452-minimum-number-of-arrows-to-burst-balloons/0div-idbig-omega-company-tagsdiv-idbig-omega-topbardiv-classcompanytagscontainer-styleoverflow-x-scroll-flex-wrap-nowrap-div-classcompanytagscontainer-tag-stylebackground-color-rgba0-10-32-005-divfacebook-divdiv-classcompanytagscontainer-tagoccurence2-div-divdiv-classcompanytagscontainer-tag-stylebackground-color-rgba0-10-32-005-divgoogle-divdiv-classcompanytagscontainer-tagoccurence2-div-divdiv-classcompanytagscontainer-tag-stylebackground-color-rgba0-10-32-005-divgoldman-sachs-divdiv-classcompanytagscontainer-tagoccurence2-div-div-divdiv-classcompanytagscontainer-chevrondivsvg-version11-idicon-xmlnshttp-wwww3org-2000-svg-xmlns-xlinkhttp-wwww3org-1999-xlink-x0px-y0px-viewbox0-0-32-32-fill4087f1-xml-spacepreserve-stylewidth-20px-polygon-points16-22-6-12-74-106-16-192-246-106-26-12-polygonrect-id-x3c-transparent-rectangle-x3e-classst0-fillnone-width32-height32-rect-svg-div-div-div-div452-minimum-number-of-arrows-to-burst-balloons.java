class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
        //sorting points in the basis of their end points
        Arrays.sort(points,Comparator.comparingInt(o->o[1])); 
        int c=1; // 1 for end balloon
        int end = points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>end){
                c++;
                end = points[i][1];
            }

        }
        return c;
    }
}