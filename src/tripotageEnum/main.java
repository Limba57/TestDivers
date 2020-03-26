package tripotageEnum;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        for (limiteDeFabrication limiteDeFabrication :
                limiteDeFabrication.values()) {
            System.out.println(limiteDeFabrication + " est fait avec " + limiteDeFabrication.fabrication);
        }

        limiteDeFabricationCollection listLimit = limiteDeFabricationCollection.getLimitCollection();

        for (String key :
                listLimit.getLimiteList().keySet()
        ) {
            System.out.println(key+" est fait avec "+ listLimit.getLimiteList().get(key).matierePremiere);
        }

    }
}
