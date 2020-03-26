package syncronise;

public class main {

    public static void main(String[] args) {
        test test = new test();

        testThread testThread = new testThread(test, 5, "un");
        testThread testThread1 = new testThread(test, 10, "deux");
        testThread testThread2 = new testThread(test, 20, "trois");

        testThread.run();
        testThread1.run();
        testThread2.run();

        System.out.println(test.toString());



    }
}
