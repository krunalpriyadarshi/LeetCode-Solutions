public class BruteForce {
    public int[] decrypt(int[] code, int k) {
        int N = code.length;
        int[] result = new int[N];
        int sum = 0;

        for(int i = 0; i < N; i++){
            if(k < 0){
                for(int j = i - 1; j >= i + k; j--){
                    if(j < 0)
                        result[i] += code[N + j];
                    else
                        result[i] += code[j];
                }
            }
            else if(k > 0){
                for(int j = i + 1; j <= i + k; j++){
                    result[i] += code[j % N];
                }
            }
        }

        return result;
    }
}
