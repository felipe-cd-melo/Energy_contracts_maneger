package org.example.energycontracts;

public enum SubSystems {
    SO("Southeast/ Midwest"),
    S("South"),
    NO("Northeast"),
    N("North");

    private final String description;

    SubSystems(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
