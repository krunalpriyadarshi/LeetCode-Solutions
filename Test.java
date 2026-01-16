
import java.util.ArrayList;
import java.util.List;

class Test{
    public static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(find(arr, 3));
}
}