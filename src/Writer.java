import java.util.ArrayList;
import java.util.Random;

public class Writer implements Runnable {
    ArrayList<Integer> myList = new ArrayList();

    public Writer(ArrayList<Integer> list) {
        myList = list;
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            try {
                Thread.sleep(2500);
                myList.add(random.nextInt(100));
                System.out.println(myList.get(myList.size() - 1).toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
