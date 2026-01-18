import java.util.List;

class Solution { 
  public static int birthday(List<Integer> s, int d, int m) {
    int sum= 0;
    
    for(int i= 0; i< m; i++){
        sum+= s.get(i);
    }
    
    int result= (sum== d)? 1: 0;
    for(int i= 0, j= i+ m; j< s.size(); i++, j++){
        sum+= s.get(j)- s.get(i);
        if(sum== d){
            result++;
        }
    }
    
    return result;
}
}
