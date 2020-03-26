package testCollections;

import java.util.*;
import java.util.Map.Entry;

public class maintTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        System.out.println(list.getClass());

        Map<String, String> map = new HashMap<>();
        System.out.println(map.getClass());

        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "toto");
        testMap.put(2, "tata");
        testMap.put(3, "tutu");
        testMap.put(4, "titi");
        testMap.put(5, "tyty");
        testMap.put(6, "tito");
        testMap.put(7, "toti");
        testMap.put(8, "tuto");
        System.out.println(testMap.toString());


        Set<Entry<Integer, String>> setEntry = testMap.entrySet();
        System.out.println(setEntry.toString());

        // modifier une list avec un iterateur

    }
}
