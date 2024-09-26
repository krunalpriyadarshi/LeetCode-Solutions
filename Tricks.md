| Collection              | Interface | Ordered | Sorted | Thread safe | Duplicate | Nullable    |
|-------------------------|-----------|---------|--------|-------------|-----------|-------------|
| ArrayList               | List      | N       | N      | N           | Y         | Y           |
| Vector                  | List      | N       | Y      | Y           | Y         | Y           |
| LinkedList              | List, Deque | Y     | N      | N           | Y         | Y           |
| CopyOnWriteArrayList    | List      | N       | Y      | Y           | Y         | Y           |
| HashSet                 | Set       | N       | N      | N           | N         | One null    |
| LinkedHashSet           | Set       | N       | N      | N           | N         | One null    |
| TreeSet                 | Set       | Y       | Y      | N           | N         | N           |
| CopyOnWriteArraySet     | Set       | N       | Y      | N           | N         | One null    |
| ConcurrentSkipListSet   | Set       | Y       | Y      | Y           | N         | N           |
| HashMap                 | Map       | N       | N      | N (key)     | N (key)   | One null    |
| HashTable               | Map       | N       | Y      | Y           | N (key)   | N (key)     |
| LinkedHashMap           | Map       | N       | N      | N (key)     | N (key)   | One null    |
| TreeMap                 | Map       | Y       | Y      | N           | N (key)   | N (key)     |
| ConcurrentHashMap       | Map       | N       | N      | Y           | N (key)   | N           |
| ConcurrentSkipListMap   | Map       | Y       | Y      | Y           | N (key)   | N           |
| ArrayDeque              | Deque     | Y       | N      | N           | N         | N           |
| PriorityQueue           | Queue     | Y       | N      | N           | N         | N           |
| ConcurrentLinkedQueue   | Queue     | Y       | N      | Y           | N         | N           |
| ConcurrentLinkedDeque   | Deque     | Y       | N      | Y           | N         | N           |
| ArrayBlockingQueue      | Queue     | Y       | N      | Y           | N         | N           |
| LinkedBlockingDeque     | Deque     | Y       | N      | Y           | N         | N           |
| PriorityBlockingQueue   | Queue     | Y       | N      | Y           | N         | N           |

we need follow proper plan
  - arrays
  - string
  - 2d 3d matrix
  - DP

type conversion from array to array list; arraylist to hashmap and vice versa...        ??????????????????

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




string.format()










 Integer a[] = new Integer[] { 10, 20, 30, 40 };


use instead of "int x= (int) Math.ceil(num/ 2.0);" 
    --> int x= (num+ 1)/ 2;

 // Getting the list view of Array
List<Integer> list = Arrays.asList(a);


d % 1 == 0    --- checks if double has decimal points.
  
to-do : LL 234



BiFunction ??
list??
HashSet????
HashMap??
LinkedHashMap???
arrays.fill(arr, start, end, val);????
BIGintergers???????
Longest Subsequence -------


biotonic means "Initially a sequence of numbers is in incresing order; however, beyond a certain point, it begins to decrease."

binary serach:
  arr[]= {1, 2, 3, 4, 5};
  left = 0, right = arr.lenght-1, mid= (left+ right)>>>1;
    if you want to add an element in sorted list take "right = arr.length". bcz it is possible that new element is maximum and it will added to last of the row.
    but if you want to find an element in sorted list take "right= arr.length-1"

    NOTE:
      Overflow can be occured while calculating mid value.
      so use (left+ (right- left)/2) instead of (left+ right)/2 or (left+ right)>>>1.
      it will avoid overflow situation for boundary values.
 
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

Lambda Expression:  
    In java, lambda is a method which is part of interface.

    code 1: Created a function interface method in a class and use it in main class method.      
      // functional interface means this interface can have only one method. if you try to include one more method it will show error. NOTE: you can include object methods like toString() method.
      @FunctionalInterface 
      interface A{
        void call(); 
        // this is interface's method. when a class implement this interface, the class must have to define method for it.
      }

      class b implement a{
        void call(){
          System.out.println("calling method.");
        }
      }

      class solution{
        void main(){
          a obj= new b();
          b.call();   // --> prints "calling method."
        }
      }

    code2: inner class to use functional interface.
      @FunctionalInterface 
      interface A{
        void call(); 
      }
      class Solution{
        // user inner class to use interface
        A obj = new A(){
            public void show(){
                System.out.println("Hello");
            }
        };
        obj.show();
      }
    
    code3: lambda function
      @FunctionalInterface 
      interface A{
        void call(); 
      }
      class Solution{
        A obj= ()-> System.out.println("Hello");
        A.call();
      }


Interview Tip:
    > When there is repetative tasks, consider DP and precomputation. 
    url: https://leetcode.com/problems/range-sum-query-2d-immutable/solutions/2104317/dp-visualised-interview-tips/

    >