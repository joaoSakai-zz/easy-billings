package com.joaosakai.easybillings.enumerations;

public enum Sensation {

    DRY("Seco"),
    STICKY("Elástico"),
    DAMP("Úmido"),
    WET("Molhado"),
    LUBRIFICATED("Lubrificado"),
    SLIPPERY("Escorregadio");

    private final String value;


    Sensation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
