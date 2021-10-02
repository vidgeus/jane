import java.util.Date;

public class PeriodicPrinter {

    /**
     * @param millis number of miliseconds to wait
     */
    public PeriodicPrinter(int millis) {
        while (true) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new Date());
        }
    }

}
