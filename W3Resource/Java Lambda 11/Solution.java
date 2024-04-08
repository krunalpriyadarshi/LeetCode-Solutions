// find minimum and maximum value of an array using lambda expression:
@FunctionalInterface
interface find {
  int[] findMINMAX(int[] arr);
}

class Solution {
  public static void main(String[] args) {

    find obj = (int[] arr) -> {
      int min = arr[0];
      int max = arr[0];
      for (int i : arr) {
        if (i < min)
          min = i;
        if (i > max)
          max = i;
      }
      return new int[] { min, max };
    };

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] result = obj.findMINMAX(arr);
    System.out.println("Minimum value: " + result[0]);
    System.out.println("Maximum value: " + result[1]);
  }
}
