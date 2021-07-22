import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//          second task
        singleFlowFill();
        multiStreamFill();

//        first task
        ArrayList<Integer> list = new ArrayList<>();
        new Thread(new Reader(list)).start();
        new Thread(new Writer(list)).start();


    }

    public static void singleFlowFill() {
        String[] mass = new String[20_000_000];
        long start = System.currentTimeMillis();
        for (int i = 0; i < mass.length; i++) {

            if (i % 3 == 0 & i % 5 == 0) {
                mass[i] = "FizzB" +
                        "uzz";
            } else if (i % 3 == 0) {
                mass[i] = "Fizz";
            } else if (i % 5 == 0) {
                mass[i] = "Buzz";
            } else {
                mass[i] = String.valueOf(i);
            }
        }
        long end = System.currentTimeMillis();
        long del = end - start;
        System.out.println("Однопоточное заполнение: " + del);
    }

    public static void multiStreamFill() {
        String[] mass = new String[20_000_000];
        long start = System.currentTimeMillis();
        new Thread(new ArrayWriter(mass, 0, 10_000_000)).start();
        new Thread(new ArrayWriter(mass, 10_000_000, 20_000_000)).start();
        long end = System.currentTimeMillis();
        long del = end - start;
        System.out.println("Многопоточное заполнение: " + del);

    }
}
