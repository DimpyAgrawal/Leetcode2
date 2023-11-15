class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        
        double[] arr = new double[target];
       for (int i = 0; i < pos.length; i++)
        {
            arr[pos[i]]= (double)(target - pos[i]) / speed[i];
        }
//         HashMap<Double,Integer>  map = new HashMap<>();
//         for(int i=0;i<pos.length;i++){
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//         }
        
//        return map.size();
        
        int res=0;
         double prev = 0.0;
        for (int i = target-1; i >=0 ; i--)
        {
            double cur = arr[i];
            if (cur > prev)
            {
                prev = cur;
                res++;
            }
        }
        return res; 
    }
}

