package fr.devavance.tp2_springboot_mvc_jpa.beans;

public enum Fonction {
    CHEF_PROJET("blue"),
    DEV_OPS("green"),
    DEV_WEB("purple"),
    DEV_AI("yellow"),
    SOFTWARE_ARCHITECT("orange");
    private final String codeCouleur;


    private Fonction(String codeCouleur) {
        this.codeCouleur = codeCouleur;
    }

    public String getCodeCouleur() {
        return this.codeCouleur;
    }

}
