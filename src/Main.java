public class Main {
    public static void main(String[] args) {
        int a = 0;

        for(int i = a; i < 10; i++){
            if(i == 0)
                System.out.println(i + " is default a value");

            else
                System.out.println("a+" + i + " is " + (a+i));
        }

    }
}