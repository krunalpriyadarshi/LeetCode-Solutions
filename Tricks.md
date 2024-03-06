
        
1 2 3 4 5 6 7 8
    5 3 4 x2
        7 4 6 x2
          8 4 6 x2 
            6 4 x1

1 2 5 3 7 8 6 4



 Integer a[] = new Integer[] { 10, 20, 30, 40 };
 // Getting the list view of Array
List<Integer> list = Arrays.asList(a);



binary serach:
  arr[]= {1, 2, 3, 4, 5};
  left = 0, right = arr.lenght-1, mid= (left+ right)>>>2;
    if you want to add an element in sorted list take "right = arr.length". bcz it is possible that new element is maximum and it will added to last of the row.
    but if you want to find an element in sorted list take "right= arr.length-1"