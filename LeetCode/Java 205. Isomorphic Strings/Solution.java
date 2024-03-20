class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.equals(t)) return true;

        int[] mapS = new int[256]; 
        int[] mapT = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (mapS[sChar] != mapT[tChar]) {
                return false;
            }
            
            mapS[sChar] = i + 1; // Update count
            mapT[tChar] = i + 1;
        }
        
        return true;
    }
}