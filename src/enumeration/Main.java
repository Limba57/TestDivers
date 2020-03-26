package enumeration;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        for (Language lang : Language.values()) {
            if (Language.JAVA.equals(lang)) {
                System.out.println("j'aime le " + lang);
            } else {
                System.out.println(lang);
            }
        }

        Language.JAVA.printEditor();

        Language l1 = Language.PHP;
        l1.printEditor();

    }
}
