class Solution {
     int c=0;
    public int numTilePossibilities(String tiles) {
      char[] ch = tiles.toCharArray();
        Arrays.sort(ch);
        solve(ch,new boolean[ch.length]);
        return c-1;
        
    }
public void solve(char []ch, boolean [] vis){
        c++;

        for(int i=0; i<ch.length; i++){
            if(vis[i] ||(i>0 && ch[i] == ch[i-1] && !vis[i-1]))continue;

            vis[i] = true;
            solve(ch, vis);
            vis[i] = false;
        }
      
    }
}