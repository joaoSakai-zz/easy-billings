package com.joaosakai.easybillings.enumerations;

public enum Fluidity {

    CONSISTENT("Consistente"),
    PASTY("Pastoso"),
    BRITTLE("Quebradiço"),
    ELASTIC("Elástico"),
    AQUEOUS("Aquoso");

    private final String value;

    Fluidity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
