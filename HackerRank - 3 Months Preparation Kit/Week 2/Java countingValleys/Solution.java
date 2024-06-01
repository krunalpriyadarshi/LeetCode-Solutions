class Solution { 
  public static int countingValleys(int steps, String path) {
    int currLevel= 0, valleyCount= 0;
    
    for(char ch: path.toCharArray()){
        if(ch== 'D'){
            if(currLevel== 0)
                valleyCount++;                
            currLevel--;
        }
        else {
            currLevel++;
        }
    }
    
    return valleyCount;

}
}
