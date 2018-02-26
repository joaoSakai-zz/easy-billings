package com.joaosakai.easybillings.enumerations;

public enum Symbol {

    RED("Vermelho"),
    YELLOW("Amarelo"),
    GREEN("Verde"),
    WHITE("Branco"),
    APEX("Ápice");

    private final String value;

    Symbol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
