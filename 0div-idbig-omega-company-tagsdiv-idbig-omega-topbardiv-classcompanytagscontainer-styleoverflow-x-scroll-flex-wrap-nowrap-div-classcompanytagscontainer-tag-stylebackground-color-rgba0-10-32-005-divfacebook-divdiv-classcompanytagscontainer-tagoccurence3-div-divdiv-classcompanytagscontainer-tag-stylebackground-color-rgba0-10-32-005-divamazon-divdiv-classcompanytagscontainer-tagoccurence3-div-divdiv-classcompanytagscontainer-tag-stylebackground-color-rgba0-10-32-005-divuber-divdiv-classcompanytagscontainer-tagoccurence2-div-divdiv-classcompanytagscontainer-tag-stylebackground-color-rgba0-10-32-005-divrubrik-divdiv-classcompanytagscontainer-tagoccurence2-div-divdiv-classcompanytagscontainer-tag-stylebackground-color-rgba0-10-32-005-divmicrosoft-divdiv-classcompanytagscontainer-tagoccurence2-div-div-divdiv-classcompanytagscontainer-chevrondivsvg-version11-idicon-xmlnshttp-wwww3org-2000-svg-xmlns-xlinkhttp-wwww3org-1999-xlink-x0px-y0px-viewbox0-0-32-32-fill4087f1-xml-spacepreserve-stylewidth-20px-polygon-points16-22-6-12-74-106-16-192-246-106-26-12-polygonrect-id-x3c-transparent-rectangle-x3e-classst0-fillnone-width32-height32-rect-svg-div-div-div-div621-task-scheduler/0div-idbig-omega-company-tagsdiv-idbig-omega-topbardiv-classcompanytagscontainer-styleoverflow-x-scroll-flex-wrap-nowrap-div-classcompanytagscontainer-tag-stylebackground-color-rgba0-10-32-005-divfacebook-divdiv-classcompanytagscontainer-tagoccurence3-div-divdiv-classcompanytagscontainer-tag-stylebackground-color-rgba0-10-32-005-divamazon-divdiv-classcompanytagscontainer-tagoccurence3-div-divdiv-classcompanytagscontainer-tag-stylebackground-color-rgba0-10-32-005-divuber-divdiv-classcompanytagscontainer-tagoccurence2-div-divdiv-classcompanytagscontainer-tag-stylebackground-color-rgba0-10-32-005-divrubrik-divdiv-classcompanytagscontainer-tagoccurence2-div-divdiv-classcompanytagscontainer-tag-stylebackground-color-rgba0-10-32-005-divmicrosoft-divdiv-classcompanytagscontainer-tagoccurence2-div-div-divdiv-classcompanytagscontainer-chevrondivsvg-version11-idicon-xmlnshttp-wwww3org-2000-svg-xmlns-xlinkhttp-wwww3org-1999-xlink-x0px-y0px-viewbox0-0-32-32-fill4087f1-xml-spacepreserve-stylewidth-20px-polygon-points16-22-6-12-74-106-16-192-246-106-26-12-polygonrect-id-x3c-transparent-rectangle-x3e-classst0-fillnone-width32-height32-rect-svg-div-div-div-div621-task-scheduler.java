class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks) freq[task-'A']++;

        Arrays.sort(freq);
        int maxfreq = freq[25];
        int idleTime = (maxfreq-1)*n;

        for(int i=24;i>=0;i--){
            idleTime -= Math.min(maxfreq-1,freq[i]); 
        } 

        return tasks.length + Math.max(idleTime,0);
    }
}