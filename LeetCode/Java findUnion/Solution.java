import java.util.*;

/**
 * This function finds the union of two sorted array while maintaining order and removing duplication.
 */
class Solution {
    public static void main(String[] args) {
        // Business logic:
        int union[] = findUnion(new int[] {}, new int[] {2});
        for(int val : union){
            System.out.print(val + " ");
        }
    }

    /**
     * Finds sorted union of two sorted array while maintaing no duplication:
     * 
     * @param arr1 - First sorted input ascending array
     * @param arr2 - Second sorted input ascending array
     * 
     * @return int[] - result array
     */
    public static int[] findUnion(int[] arr1, int[] arr2){
        // Expected result array:
        ArrayList<Integer> result = new ArrayList<>();

        // Two pointer approach: 
        int i = 0, j = 0;
        
        // Traverse elements from both array untill end of any array:
        while(i < arr1.length && j < arr2.length){
            // find smaller element among both pointers and add it to result array:
            if(arr1[i] < arr2[j]){
                if(result.isEmpty() || (result.get(result.size() - 1) != arr1[i])){
                    result.add(arr1[i]);
                }
                i++;
            }

            // find smaller element among both pointers and add it to result array:
            else if(arr1[i] > arr2[j]){
                if(result.isEmpty() || (result.get(result.size() - 1) != arr2[j])){
                    result.add(arr2[j]);
                }
                j++;
            }

            // If both pointers represents same value, pick any one element:
            else{
                result.add(arr1[i++]);
                j++;
            }
        }
        
        // Adds remaning elements from arr1 while avoiding duplicate values:
        while(i < arr1.length){
            if(result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                result.add(arr1[i]);
            i++;
        }
        
        // Adds remaning elements from arr2 while avoiding duplicate values:
        while(j < arr2.length){
            if(result.isEmpty() || result.get(result.size() - 1) != arr2[j])
                result.add(arr2[j]);
            j++;
        }
        
        // Converting result arrayList into expected int[] formated:
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}