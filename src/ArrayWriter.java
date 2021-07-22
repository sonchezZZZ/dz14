public class ArrayWriter implements Runnable {
    private int startIndex;
    private int endIndex;
    private String[] massive;

    public ArrayWriter(String[] mass, int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.massive = mass;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                massive[i] = "FizzB" +
                        "uzz";
            } else if (i % 3 == 0) {
                massive[i] = "Fizz";
            } else if (i % 5 == 0) {
                massive[i] = "Buzz";
            } else {
                massive[i] = String.valueOf(i);
            }
        }
    }
}
