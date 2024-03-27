Sorting - Insertion sort, Merge sort, Quick sort, Heap sort, Bucket sort, Counting sort, Radix sort, External sorting
Search - Linear search, Binary Search (along with its variants).
Prime Numbers - Sieve of Eratosthenes, Primality test
Strings - String searching, LCS, Palindrome detection
Miscellaneous - Euclidean algorithm, Matrix multiplication, Fibonacci Numbers, Pascal's Triangle, Max Subarray problem
Day 26 - 50: Once you are comfortable with everything above, start doing problems from,

Cracking the Coding Interview
Elements of Programming Interviews
Programming Interviews Exposed: Secrets to Landing Your Next Job
GeeksforGeeks
HackerRank
InterviewBit

link: https://www.quora.com/Is-it-necessary-to-learn-algorithms-and-data-structures-before-starting-on-artificial-intelligence









 Integer a[] = new Integer[] { 10, 20, 30, 40 };




 // Getting the list view of Array
List<Integer> list = Arrays.asList(a);


d % 1 == 0    --- checks if double has decimal points.
  
to-do : LL 234

list??
HashSet????
HashMap??
LinkedHashMap???
arrays.fill(arr, start, end, val);????
BIGintergers???????
Longest Subsequence -------
lambda expression??


biotonic means "Initially a sequence of numbers is in incresing order; however, beyond a certain point, it begins to decrease."



binary serach:
  arr[]= {1, 2, 3, 4, 5};
  left = 0, right = arr.lenght-1, mid= (left+ right)>>>2;
    if you want to add an element in sorted list take "right = arr.length". bcz it is possible that new element is maximum and it will added to last of the row.
    but if you want to find an element in sorted list take "right= arr.length-1"
 
integer-wraparound:
      When Overflow or Underflow occurs Java internal will wrap the integer range.
      ex., 
        char c= -128 
        c-=1;
        Which will be -129 but it is out of char range.
        So wrap-around will put 127 instead of giving error.

        Same thing for.,
        Char c= 127;
        c+=1;
        output: c: -128 because of wrap-around concept.

        This concept does not apply to floating data type because of significant bits.

Overflow:   Integer.MAX_VALUE + 1   --> result value is too big to fit in Integer data type cause Overflow.
Underflow:  Integer.MIN_VALUE - 1   --> result value is too small to fit in Integer data type cause Undeflow.
