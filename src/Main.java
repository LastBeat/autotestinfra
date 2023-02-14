import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOG = Logger.getGlobal();
    public static void main(String[] args) {
        int a = 0;

        for(int i = a; i < 100; i++){
            if(i == 0)
                // As-is
                // System.out.println(i + " is default a value");

                // To-Be
                LOG.info(i + " is default a value");


            else
                // As-is
                // System.out.println("a+" + i + " is " + (a+i));

                // To-Be
                LOG.info("a+" + i + " is " + (a+i));
        }

        LOG.info("END.");

    }
}