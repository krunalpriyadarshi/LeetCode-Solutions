@FunctionalInterface
interface Calculator{
    void compute(int a, int b);
}

class Test{
    public static void main(String[] args) {
        
        Calculator add = (int a, int b) -> System.out.println(a+b);

        add.compute(10, 20);
    }
}