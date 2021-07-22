import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Reader implements Runnable {
    private ArrayList<Integer> myList = new ArrayList<>();

    public Reader(ArrayList<Integer> list) {
        myList = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                if (!myList.isEmpty()) {
                    System.out.println(myList.toString());
                    myList.clear();
                } else {
                    System.out.println(new Date().toString() + " The list is empty");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
