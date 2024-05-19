// 397. Integer Replacment
// TC: O(1)

// Best approach as TC is irrelevant to n. 
// Here, if n is odd, then we have 2 choices (n-1) or (n+1). But here we only take (n-1) value if (n-1)/2 is even as it will be fastest route to reach 1.
public class Optimal {
    public int integerReplacement(int n) {
        // to handle OverFlow situation:
        if(n== Integer.MAX_VALUE)
            n-= 1;
            
        int result= 0, temp;
        while(n!= 1){
            if(n% 2== 0)
                n/= 2;
            else{
                // if "(n-1)/2" is even then only we are going to take that value of n else we will perform (n+1):
                temp= (n- 1)/ 2;

                // temp== 1 is special case for n= 3;
                if(temp% 2== 0 || temp== 1)
                    n-= 1;
                else 
                    n+= 1;
            }
            result++; 
        }

        return result;
    }

    public static void main(String[] args) {
        Optimal optimal= new Optimal();
        System.out.println(optimal.integerReplacement(8));
        System.out.println(optimal.integerReplacement(51));
    }
}
