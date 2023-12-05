In loop, "StringBuilder" is better to use inplace of String Concatenation:
        Strings are immutale while StringBuilder are mutable.
        ex.,
            String Concatenation:
                String str= a+ b+ c; //a,b,c are string variable.
            StringBuilder: 
                StringBuilder str.append(a).append(b).append(c).append(" ");