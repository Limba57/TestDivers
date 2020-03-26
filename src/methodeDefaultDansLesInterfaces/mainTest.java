package methodeDefaultDansLesInterfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class mainTest {

    public static void main(String[] args) {

        ClasseImlementantInterfaceTest test = new ClasseImlementantInterfaceTest();

        System.out.println(test.methodeDefault(50));
        System.out.println(test.methodeAbstraite(150));
        InterfacesTest.methodeStatic(200);

        AutreClasseTestImplementantLInterface test2 = new AutreClasseTestImplementantLInterface();

        System.out.println(test2.methodeAbstraite(20));
        System.out.println(test2.methodeDefault(120));
        AutreClasseTestImplementantLInterface.methodeStatic(200);

        var tab = new ArrayList<String>();
        tab.add("C'est java ou javaScript ?");
        tab.add("deuxieme entrée dans tab");
        System.out.println("tab = " + tab);
    }
}
