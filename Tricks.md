# Java DSA Study Notes & Reference

* * *

## Java Collections Cheat Sheet

| Collection | Interface | Ordered | Sorted | Thread Safe | Duplicate | Nullable |
| --- | --- | --- | --- | --- | --- | --- |
| ArrayList | List | N | N | N | Y | Y |
| Vector | List | N | Y | Y | Y | Y |
| LinkedList | List, Deque | Y | N | N | Y | Y |
| CopyOnWriteArrayList | List | N | Y | Y | Y | Y |
| HashSet | Set | N | N | N | N | One null |
| LinkedHashSet | Set | N | N | N | N | One null |
| TreeSet | Set | Y | Y | N | N | N |
| CopyOnWriteArraySet | Set | N | Y | N | N | One null |
| ConcurrentSkipListSet | Set | Y | Y | Y | N | N |
| HashMap | Map | N | N | N (key) | N (key) | One null |
| HashTable | Map | N | Y | Y | N (key) | N (key) |
| LinkedHashMap | Map | N | N | N (key) | N (key) | One null |
| TreeMap | Map | Y | Y | N | N (key) | N (key) |
| ConcurrentHashMap | Map | N | N | Y | N (key) | N |
| ConcurrentSkipListMap | Map | Y | Y | Y | N (key) | N |
| ArrayDeque | Deque | Y | N | N | N | N |
| PriorityQueue | Queue | Y | N | N | N | N |
| ConcurrentLinkedQueue | Queue | Y | N | Y | N | N |
| ConcurrentLinkedDeque | Deque | Y | N | Y | N | N |
| ArrayBlockingQueue | Queue | Y | N | Y | N | N |
| LinkedBlockingDeque | Deque | Y | N | Y | N | N |
| PriorityBlockingQueue | Queue | Y | N | Y | N | N |

* * *

## Study Plan

* Prime Numbers: Sieve of Eratosthenes, Primality Test
* Euclidean Algorithm (GCD)
* Fibonacci Numbers
* Pascal's Triangle

* String Searching
* Longest Common Subsequence (LCS)
* Palindrome Detection

* Matrix Multiplication
* Max Subarray Problem (Kadane's Algorithm)

### Resources

* Cracking the Coding Interview
* Elements of Programming Interviews
* Programming Interviews Exposed
* GeeksforGeeks
* HackerRank
* InterviewBit

## Revision

* BiFunction
* List internals
* HashSet internals
* HashMap internals
* LinkedHashMap internals
* Arrays.fill(arr, start, end, val)
* BigInteger
* Longest Subsequence
* How Heap works internally
* How TreeSet works internally
* LeetCode 234 (Linked List Palindrome)

## String Formatting

Three main ways to format strings in Java:
| Method | Use Case |
| --- | --- |
| String.format() | Most commonly used |
| System.out.printf() | For printing formatted strings |
| Formatter class | Advanced usage |

### Syntax

```
String.format("template", ...args);
```

### Format Specifiers

| Specifier | Type |
| --- | --- |
| %s | String |
| %d | Integer (Digits) |
| %f | Float / Double |
| %.2f | Float with 2 decimal places |
| %% | Literal % character |
| %,f | Long value with commas e.g. 123,456,789 |

### String format

```java
String msg = String.format("Hello, %s!", "Kunal");
System.out.printf("You scored %.1f%% in the test.%n", 92.5);
```

## Arrays

```java
// Typed Integer array
Integer a[] = new Integer[] { 10, 20, 30, 40 };

// Get List view of an Array
List<Integer> list = Arrays.asList(a);

// Fill array with a value
Arrays.fill(arr, start, end, val);
```

## Ceiling Division (Avoid floating-point)

Instead of:

```java
int x = (int) Math.ceil(num / 2.0);
```

Use:

```java
int x = (num + 1) / 2;
```

### Integer Overflow and Underflow

```java
Integer.MAX_VALUE + 1   // Overflow  -> wraps to Integer.MIN_VALUE
Integer.MIN_VALUE - 1   // Underflow -> wraps to Integer.MAX_VALUE
```

### Integer Wrap-Around (char example)

```java
char c = -128;
c -= 1;  // -> 127 (wraps around)

char c = 127;
c += 1;  // -> -128 (wraps around)
```

NOTE: Wrap-around does NOT apply to floating-point types due to how significant bits work.

### Useful Checks

```java
// Check if a double has no decimal part
d % 1 == 0
```

### GCD - Greatest Common Divisor (Euclidean Algorithm)

```java
int gcd(int a, int b) {
    if (b == 0)
        return a;
    return gcd(b, a % b);
}
```

### Convert String or Binary digits to Hex, Binary or base-10 number

* As you read each left to right, you don't know a digit's true place value until you see what comes after it. So at every step, you multiply your running total by 10 (shifting everything left one column) and add the new digit.

* Try: `1290. Convert Binary Number in a Linked List to Integer`

#### For String value `123` -> Decimal `123`

| Step | Char | Operation | Running Total |
|------|------|-----------|---------------|
| 1 | `1` | 0 × 10 + 1 | 1 |
| 2 | `2` | 1 × 10 + 2 | 12 |
| 3 | `3` | 12 × 10 + 3 | 123 |

#### For Binary number `1011` -> Decimal `11`

| Step | Char | Operation | Running Total |
|------|------|-----------|---------------|
| 1 | `1` | 0 × 2 + 1 | 1 |
| 2 | `0` | 1 × 2 + 0 | 2 |
| 3 | `1` | 2 × 2 + 1 | 5 |
| 4 | `1` | 5 × 2 + 1 | 11 |

### Linked List

* Dummy Node Approach is useful for edge cases such as head deletion.
Reference: LeetCode 203 - Remove Linked List Elements

## Binary Search

```java
int[] arr = {1, 2, 3, 4, 5};
int left = 0;
int right = arr.length - 1;   // use arr.length - 1 to FIND an element
// int right = arr.length;    // use arr.length to INSERT into sorted list
int mid = left + (right - left) / 2;
```

NOTE: Use left + (right - left) / 2 instead of (left + right) / 2 to avoid integer overflow at boundary values.

### Lambda Expressions

In Java, a lambda is a concise way to implement a FunctionalInterface.
A FunctionalInterface can have only one abstract method. Object methods like toString() are allowed.

### Evolution: Class to Anonymous Class to Lambda

Step 1: Separate class

```java
@FunctionalInterface
interface A {
    void call();
}

class B implements A {
    public void call() {
        System.out.println("calling method.");
    }
}

class Solution {
    void main() {
        A obj = new B();
        obj.call(); // prints "calling method."
    }
}
```

Step 2: Anonymous inner class

```java
A obj = new A() {
    public void call() {
        System.out.println("Hello");
    }
};
obj.call();
```

Step 3: Lambda (cleanest)

```java
A obj = () -> System.out.println("Hello");
obj.call();
```

### Concepts and Definitions

Bitonic Sequence: A sequence that is first strictly increasing and then strictly decreasing beyond a certain point.

### Interview Tips

When you see repetitive tasks, think DP and Precomputation.
Reference: [https://leetcode.com/problems/range-sum-query-2d-immutable/solutions/2104317/dp-visualised-interview-tips/](https://leetcode.com/problems/range-sum-query-2d-immutable/solutions/2104317/dp-visualised-interview-tips/)