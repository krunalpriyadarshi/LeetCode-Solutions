class Bad {
    public int findComplement(int num) {
        StringBuilder result= new StringBuilder(Integer.toBinaryString(num));

        for(int i= 0; i< result.length(); i++){
            if(result.charAt(i)== '0')
                result.setCharAt(i, '1');
            else 
                result.setCharAt(i, '0');
        }

        return Integer.parseInt(result.toString(), 2);
    }
}