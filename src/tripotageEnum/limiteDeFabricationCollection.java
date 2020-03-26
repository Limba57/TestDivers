package tripotageEnum;

import java.util.HashMap;
import java.util.Map;

public class limiteDeFabricationCollection {

    public static limiteDeFabricationCollection getLimitCollection() {
        if (limiteDeFabrication != null) {
            return limiteDeFabrication;
        } else {
            limiteDeFabrication = new limiteDeFabricationCollection();
            return limiteDeFabrication;
        }
    }

    static limiteDeFabricationCollection limiteDeFabrication;

    private Map<String, Technique> limiteList;

    class Technique {

        MatierePremiere matierePremiere;
        int limiteHaute;
        int limiteBasse;
        int prix;

        public Technique(MatierePremiere matierePremiere, int limiteHaute, int limiteBasse, int prix) {
            this.matierePremiere = matierePremiere;
            this.limiteHaute = limiteHaute;
            this.limiteBasse = limiteBasse;
            this.prix = prix;
        }
    }


    private limiteDeFabricationCollection() {

        limiteList = new HashMap<>();

        limiteList.put("Cadre", new Technique(MatierePremiere.BAGUETTE,
                2000,
                100,
                30));
        limiteList.put("Bizeau", new Technique(MatierePremiere.CARTON,
                1500,
                150,
                20));
        limiteList.put("Sous verre", new Technique(MatierePremiere.VERRE,
                1000,
                200,
                50));

    }

    public Map<String, Technique> getLimiteList() {
        return limiteList;
    }
}

