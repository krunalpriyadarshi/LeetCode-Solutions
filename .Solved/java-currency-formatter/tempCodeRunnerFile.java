import java.text.NumberFormat;
import java.util.Locale;
public class MainClass {
    public static void main(String[] args) {
       // Currency of France is Euro
       NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
       // points
       double points = 1.78;
       double totalPoints = points * 1000;
       System.out.println(n.format(points));
       System.out.println(n.format(totalPoints));
    }
}