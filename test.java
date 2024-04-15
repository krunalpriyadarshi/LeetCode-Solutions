import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("World");
        list.add(0, "Hello");
        System.out.println(list);
    }
}