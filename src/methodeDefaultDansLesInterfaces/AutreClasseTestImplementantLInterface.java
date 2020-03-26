package methodeDefaultDansLesInterfaces;

public class AutreClasseTestImplementantLInterface implements InterfacesTest {

    @Override
    public String methodeAbstraite(int i) {

        return "Methode abstraite de la classe autre classe: parametre i:" + i+ name;

    }

    @Override
    public String methodeDefault(int i) {
        return "Methodedefault overide de la classe autre classe: parametre i:" + i;
    }

    public static void methodeStatic(int i) {
        System.out.println("methode satic dans la classe test reprenant la signature de celle de l'interface: parametre i:" + i);

    }
}
