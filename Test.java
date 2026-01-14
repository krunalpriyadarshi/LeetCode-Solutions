
import java.util.ArrayList;
import java.util.List;

class Test{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(4));
    }
}