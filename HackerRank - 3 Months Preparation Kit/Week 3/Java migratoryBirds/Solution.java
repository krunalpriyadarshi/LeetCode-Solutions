import java.util.List;

class Solution { 
  public static int migratoryBirds(List<Integer> arr) {
    int[] sightedTypes= new int[6];
    
    for(int i: arr){
        sightedTypes[i]++;
    }
    
    // finding max number of birds spotted:
    int max= 0;
    for(int i: sightedTypes)
        max= Math.max(max, i);
        
    for(int i= 1; i< sightedTypes.length; i++){
        if(sightedTypes[i]== max)
            return i;
    }
    
    return -1;
}
}
