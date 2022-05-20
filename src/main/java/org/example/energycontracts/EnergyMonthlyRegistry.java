package org.example.energycontracts;

import java.util.ArrayList;

public class EnergyMonthlyRegistry {
    Integer year;
    Integer month;
    ArrayList<EnergyContractShort> contractsList;

    public EnergyMonthlyRegistry(Integer year, Integer month) {
        this.year = year;
        this.month = month;
    }

    public Integer getYear(){return this.year; }

    public Integer getMonth(){return this.month; }

    public ArrayList<EnergyContractShort> getContractsList(){return this.contractsList;}

    public void addContract(EnergyContractShort contract){
        this.contractsList.add(contract);
    }

    public void removeContract(EnergyContractShort contract){
        this.contractsList.remove(contract);
    }


}
