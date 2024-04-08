@FunctionalInterface
interface A{
    void show();
}
public class test {
    public static void main(String[] args) {
        // user inner class to use interface
        A obj = ()->System.out.println("calling");

        obj.show();
    }
}
