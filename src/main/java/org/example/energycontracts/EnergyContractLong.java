package org.example.energycontracts;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;

public class EnergyContractLong {
    private String id;
    private EnergyType energyType;
    private BigDecimal price;
    private SubSystems subSystem;
    private Double mwh;
    private Date startDate;
    private Date endDate;
    private Double flexMax;
    private Double flexMin;
    private Double sazoMax;
    private Double sazoMin;
    private ArrayList<EnergyContractShort> distribuion;



    public EnergyContractLong(String id, String sellerId, String buyerId, String buyer, EnergyType energyType,
                              BigDecimal price, SubSystems subSystem, Double mwh, Date startDate, Date endDate) {
        this.id = id;
        this.energyType = energyType;
        this.price = price;
        this.subSystem = subSystem;
        this.mwh = mwh;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
