import java.util.logging.Logger;

public class Main {
    private final static Logger LOG = Logger.getGlobal();
    public static void main(String[] args) {
        int a = 0;

        for(int i = a; i < 100; i++){
            if(i == 0)
                LOG.info(i + " is default a value");


            else
                LOG.info("a+" + i + " is " + (a+i));
        }

        LOG.info("END.");

    }
}