class testing {
    public static void main(String[] args){
        int year= 2023;
        int yearCode= (year + (year/ 4)) %7;
        System.out.println(yearCode);
    }
}
