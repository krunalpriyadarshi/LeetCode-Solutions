class Solution { 
  public static int marsExploration(String s) {
    int result= 0;
    String standardSignal= "SOS";
    
    for(int i= 0; i< s.length(); i++){
        if(s.charAt(i)!= standardSignal.charAt(i% 3))
            result++;
    }

    return result;
}
}
