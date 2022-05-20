package org.example.energycontracts;

import java.math.BigDecimal;

public class EnergyContractShort {
    private String parentId = null;
    private Integer month;
    private Integer year;
    private String id;
    private String sellerId = null;
    private String seller = null;
    private String buyerId = null;
    private String buyer = null;
    private EnergyType energyType;
    private BigDecimal price = BigDecimal.valueOf(0D);
    private SubSystems subSystem;
    private Double mwhBase = 0D;
    private Double mwhRegister = 0D;
    private Double flexMax = 0D;
    private Double flexMin = 0D;
    private boolean registered = false;

    public EnergyContractShort(String parentId, Integer month, Integer year, String buyer, String buyerId,
                               EnergyType energyType, SubSystems subSystem){
        this.parentId = parentId;
        this.month = month;
        this.year = year;
        this.buyer = buyer;
        this.buyerId = buyerId;
        this.energyType = energyType;
        this.subSystem = subSystem;
        this.id = this.parentId +"-"+ this.buyerId+"-"+this.year+"_"+this.month;
    }

    public void setRegistered(boolean registered){
        this.registered = registered;
    }
}
