class Test{
    enum Day{
        Monday, 
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }

    public boolean isWeekend(Day day){
        return (day == Day.Saturday || day == Day.Sunday)? true : false;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.isWeekend(Day.Saturday));
        System.out.println(test.isWeekend(Day.Monday));
    }
}