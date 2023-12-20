In loop, "StringBuilder" is better to use inplace of String Concatenation:
        Strings are immutale while StringBuilder are mutable.
        ex.,
            String Concatenation:
                String str= a+ b+ c; //a,b,c are string variable.
            StringBuilder: 
                StringBuilder str.append(a).append(b).append(c).append(" ");

        // using setLength(0) to reset the StringBuilder or creating a new one in each iteration.
        
Make sure to close "scanner" at the end.
        Scanner sc= new Scannner();
        sc.close();


Integer.valueOf(scanner.nextLine()); ------------------- vs ----------- scanner.nextInt();
        User will enter some value in input stream Which will be read by Scanner.

        Integer.valueOf(scanner.nextLine());
                It will read whole line and convert it into Integer Value. And input stream will be empty after that.
                For Empty or non-interger value, it will throw NumberFormatException.
        scanner.nextInt();
                It will read only INT part from input stream and leave remaining white spaces in input stream. Which will causing error in subsequent input reading. 
                For Empty or non-interger value, it will throw InputMismatchException.

isEmpty() method is safe to use even if the string is null. It returns true if the string is empty or null.
equals("") could throw a NullPointerException if the string is null.
        String str = null;
        System.out.println(str.isEmpty());      // No exception, prints 'true'
        System.out.println(str.equals(""));     // NullPointerException

A substring of a string is a contiguous block of characters in the string
        ex., the substrings of abc are a, b, c, ab, bc, and abc.