import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String... args) throws InterruptedException {
        var myVar = "Jane test";
        System.out.println(myVar);
        System.out.println(myVar.toLowerCase());
        System.out.println(myVar.toUpperCase());

        new PeriodicPrinter(3000);
    }


}
