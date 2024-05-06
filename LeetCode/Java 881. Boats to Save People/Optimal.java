// 881. Boats to Save People
// URL: https://leetcode.com/problems/boats-to-save-people/

public record Optimal() {
    public int numRescueBoats(int[] people, int limit) {
        int[] weight= new int[limit+ 1];
        for(int i: people){
            weight[i]++;
        }

        int start= 1, end= limit, count= 0;
        while(start< end){
            if(weight[start]== 0)
                start++;
            else if(weight[end]== 0)
                end--;
            else{
                if(start+ end<= limit){
                    int min= (weight[start]< weight[end])? weight[start]: weight[end];
                    weight[start]-= min;
                    weight[end]-= min; 
                    count+= min; 

                }
                else if(end<= limit){
                    count+= weight[end];
                    end--;
                }
                else if(start<= limit){
                    count+= weight[start];
                    start++;
                }
            }
        }
        if(start* 2<= limit){
            count+= (int) Math.ceil(weight[start]/ 2.0);
        }
        else{
            count+= weight[start];
        }

        return count;
    }

    public static void main(String[] args) {
        Optimal o= new Optimal();
        int[] people= {3, 2, 2, 1};
        int limit= 3;
        System.out.println(o.numRescueBoats(people, limit));
    }
}
