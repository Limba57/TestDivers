package syncronise;

import java.util.ArrayList;
import java.util.List;

public class test {

    public List<String> stringList;

    public test() {
        stringList = new ArrayList<>();
    }

    public synchronized void addList(String s) throws InterruptedException{
        System.out.println("test "+s);
        //wait();
        stringList.add(s);
        //notify();
    }

}
