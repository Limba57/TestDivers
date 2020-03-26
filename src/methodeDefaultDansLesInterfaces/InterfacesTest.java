package methodeDefaultDansLesInterfaces;

public interface InterfacesTest {

    String name = "Seb";

    public String methodeAbstraite(int i);

    public static void methodeStatic(int i) {
        System.out.println("methode static: parametre i:" + i);
    }

    public default String methodeDefault(int i) {
        return "methode defaut de l'interface : parametre i:" + i;
    }

}
