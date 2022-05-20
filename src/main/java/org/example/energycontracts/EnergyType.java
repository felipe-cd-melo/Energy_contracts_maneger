package org.example.energycontracts;

enum EnergyType {
    CONV(0D),
    I1(1D),
    I8(0.8D),
    I5(0.5D),
    I0(0D);

    final private Double discount;

    EnergyType(Double discount) {
        this.discount = discount;
    }

    public Double getDiscount() {
        return this.discount;
    }
}
