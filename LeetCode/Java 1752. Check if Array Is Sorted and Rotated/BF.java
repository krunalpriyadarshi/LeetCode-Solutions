
import java.util.ArrayList;
import java.util.List;

class BF {
    /**
        checks if array is sorted or not.
        @nums: Input arrayList
        @return true: if input list is sorted
        @return false: if input list is not sorted
    */
    public boolean isSorted(List<Integer> nums){
        for(int i = 0; i < nums.size() - 1; i++){
            // checks for invalid sequence
            if(nums.get(i) > nums.get(i + 1))
                return false;
        }
        return true;
    }

    /**
        Checks if the array was originally sorted in non-decresing order, then rotated by x position.
        @nums: input array
        @return true: if sorted and rotated in some x positions
        @return false: when condition is not meet.
     */
    public boolean check(int[] nums) {
        // converting array into ArrayList
        List<Integer> arr;
        arr = new ArrayList<>();
        for(int val : nums){
            arr.add(val);
        }

        // Rotate arrayList by x position
        for(int i = 0; i < arr.size(); i++){
            // checks if list is sorted or not
            if(isSorted(arr))
                return true;

            // rotating list by 1 index
            int temp = arr.remove(0);
            arr.add(temp);
        }

        // condition not meet
        return false;
    }
}