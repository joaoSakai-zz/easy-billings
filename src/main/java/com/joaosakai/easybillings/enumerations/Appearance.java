package com.joaosakai.easybillings.enumerations;

public enum Appearance {

    WHITE("Branco"),
    OPAQUE("Opaco"),
    TRANSPARENT("Transparente"),
    PINK("Rosa"),
    YELLOW("Amarelo");

    private final String value;

    Appearance(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
