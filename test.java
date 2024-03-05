import java.util.*;

class Result {

    public void minimumBribes(List<Integer> q) {
        int bribe = 0;
        boolean isChaotic = false;

        for (int i = 0; i < q.size(); i++) {
            int diff = q.get(i) - (i + 1);

            if (diff > 2) {
                isChaotic = true;
                break;
            }
            // 1 2 5 3 7 8 6 4
            // 0 1 2 3 4 5 6 7
            /**
             * 1 2 5 3
            i= 3
            j =1
            */
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                
                System.out.println(q.get(i)+" "+q.get(j));

                if (q.get(j) > q.get(i)) {
                    System.out.println(i+" ---------"+q.get(i)+" "+q.get(j));
                    bribe++;
                }
            }
        }

        System.out.println((isChaotic) ? "Too chaotic" : bribe);
    }
}
class test {
    public static void main(String args[]) {
        System.out.println("");
        System.out.println("");
        Result r = new Result();
        r.minimumBribes(Arrays.asList(1,2 ,5, 3, 7, 8, 6, 4));

        System.out.println("");
        System.out.println("");
    }
}
