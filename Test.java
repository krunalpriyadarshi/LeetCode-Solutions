import java.util.ArrayList;
import java.util.List;
class Test{
    public static void unionArrayHelper(List<Integer> result, int[] arr, int pointer){
        if(pointer == arr.length)
            return;
        if(result.get(result.size() - 1) != arr[pointer])
            result.add(arr[pointer]);
        pointer++;
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        /*
        1 2 3 4 4 4
                      i
        1 3 4 5 5 5 6 7 7 7
                        j

        arrL = 1 2 3 4 5  6 7 
        */ 

        List<Integer> result = new ArrayList<>();
        int pointer1 = 0, pointer2 = 0;

        if(nums1[pointer1] <= nums2[pointer2]){
            result.add(nums1[pointer1]);
            pointer1++;
        }
        else{
            result.add(nums2[pointer2]);
            pointer2++;
        }
        
        while(pointer1 < nums1.length && pointer2 < nums2.length){
            while(pointer1 < nums1.length && nums1[pointer1] == result.get(result.size() - 1)){
                pointer1++;
            }
            while(pointer2 < nums2.length && nums2[pointer2] == result.get(result.size() - 1)){
                pointer2++;
            }

            if(nums1[pointer1] <= nums2[pointer2]){
                result.add(nums1[pointer1]);
                pointer1++;
            }
            else{
                result.add(nums2[pointer2]);
                pointer2++;
            }
        }

        if(pointer1 == nums1.length){
            unionArrayHelper(result, nums2, pointer2);
        }
        else if(pointer2 == nums2.length){
            unionArrayHelper(result, nums1, pointer1);
        }

        return result.stream()
                    .mapToInt(i -> 1)
                    .toArray();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        int[] arr = unionArray(arr1, arr2);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
}
}

/*
 1 2 3 3 3 4 
 1 3 5 5
*/