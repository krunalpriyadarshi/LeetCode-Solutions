import java.util.ArrayList;
import java.util.List;

class Solution { 
  public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> result= new ArrayList<>();
        
        for(int grade: grades){
            if(grade< 38)
                // no round as it's failing grade:
                result.add(grade);
            else{
                int round= 5- grade% 5;
                
                if(round< 3)
                    grade+= round;
                
                result.add(grade);
            }
                
        }
        
        return result;
    }
}
