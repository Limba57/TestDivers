package tripotageEnum;

public enum limiteDeFabrication {

    CADRE(MatierePremiere.BAGUETTE,2500,100,30),
    BISEAU(MatierePremiere.CARTON,1500, 50, 20),
    SOUS_VERRE(MatierePremiere.VERRE, 2000, 150, 50),

    ;

    MatierePremiere fabrication;
    int limiteHaute;
    int limiteBasse;
    int prix;

    limiteDeFabrication(MatierePremiere fabrication, int limiteHaute, int limiteBasse, int prix) {
        this.fabrication = fabrication;
        this.limiteHaute = limiteHaute;
        this.limiteBasse = limiteBasse;
        this.prix = prix;
    }


}
