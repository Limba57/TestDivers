package methodeDefaultDansLesInterfaces;

public class ClasseImlementantInterfaceTest implements InterfacesTest {

    @Override
    public String methodeAbstraite(int i) {
        return "methode abstraite implémenté dans une classe: parametre i:" + i;
    }
}
