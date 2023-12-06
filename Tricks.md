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

isEmpty() method is safe to use even if the string is null. It returns true if the string is empty or null.
equals("") could throw a NullPointerException if the string is null.
        String str = null;
        System.out.println(str.isEmpty());      // No exception, prints 'true'
        System.out.println(str.equals(""));     // NullPointerException