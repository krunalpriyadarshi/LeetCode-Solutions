// 1404. Number of Steps to Reduce

/* Here, we will traverse the string in reverse order:
 * 
 * we are going to implement carry concept while traversing string in reverse order:
 * NOTE: we need "1" at end so we will perform operation from length of n to index 1 of string; 
 * 
 * so we have 4 possibility:
 * Carry  | Char  | Action
 * 0      | 0     | step++  (divide number by 2.)
 * 0      | 1     | step+=2 (to convert char '1' to '0' and then dividing number by 2.), carry++ 
 * 1      | 0     | step+=2 (to convert char '1' to '0' and then dividing number by 2.), carry++ 
 * 1      | 1     | char+ carry will result in '0' in bits. so we just need to divide number by 2. but make sure not to touch carry.
 * 
 * at last if carry== 1, we will do step++; 
*/

class Solution {
  public int numSteps(String s) {
      int steps= 0, carry= 0;

      for(int i=  s.length()- 1; i> 0; i--){
          if(carry== 0 && s.charAt(i)== '1'){
                  carry= 1;
                  steps++;
          }
          if(carry== 1 && s.charAt(i)== '0')
                  steps++;

          steps++;
      }

      if(carry== 1)
          steps++;

      return steps;
  }
}