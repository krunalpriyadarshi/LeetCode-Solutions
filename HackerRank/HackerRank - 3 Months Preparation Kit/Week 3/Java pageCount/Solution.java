class Solution { 
  public static int pageCount(int n, int p) {
    if(n% 2== 0)
        n++;
        return (Math.min(Math.abs(0- p), Math.abs(n- p)))/ 2;
    }
}
