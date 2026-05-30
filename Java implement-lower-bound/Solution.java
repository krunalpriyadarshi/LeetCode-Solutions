class Solution {

    private static int findLowerBound(int N, int[] arr, int x){
        int leftIndex = 0, rightIndex = N - 1, midIndex;

        while(leftIndex < rightIndex){
            midIndex = (leftIndex + rightIndex) / 2;
            
        }
    }

    public static void main(String[] args) {
        if(5 != findLowerBound(5, new int[] {1, 3, 5, 7, 9}, 10))
            System.err.println("ERROR Testcase 1");
        
        if(0 != findLowerBound(5, new int[] {1, 3, 5, 7, 9}, 0))
            System.err.println("ERROR Testcase 2");

        if(1 != findLowerBound(5, new int[] {1, 3, 5, 7, 9}, 2))
            System.err.println("ERROR Testcase 3");

        if(0 != findLowerBound(0, new int[] {}, 0))
            System.err.println("ERROR Testcase 4");
    }
}

/**
 * 
 * 1 3 5 7 9 
 * 
 * 10 -> len = 5
 * 0 -> 0
 * 2 -> 1
 * 
 * 
 * 
 * 
 * 
 * 
 */