package syncronise;

public class testThread implements Runnable {

    public test test;
    public int anInt;
    public String name;

    public testThread(test test, int i, String name) {
        this.test = test;
        this.anInt = i;
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < anInt; i++) {
            System.out.println("run "+name+i);
            try {
                test.addList(name + i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



}
