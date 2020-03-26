package stream;

import java.util.Arrays;
import java.util.List;

public class mainTest {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long s = intList.stream()
                .filter(val -> val % 2 == 0)
                .mapToLong(val -> val*10)
                .sum();

        System.out.println(s);
    }
}
