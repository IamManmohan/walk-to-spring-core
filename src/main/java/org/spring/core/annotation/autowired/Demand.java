package org.spring.core.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Demand {
    private String rateOfDemand;
    @Autowired
    private Supply supply;

    public Demand() {
        super();
    }

    public Demand(String rateOfDemand, Supply supply) {
        this.rateOfDemand = rateOfDemand;
        this.supply = supply;
    }

    public String getRateOfDemand() {
        return rateOfDemand;
    }

    public void setRateOfDemand(String rateOfDemand) {
        this.rateOfDemand = rateOfDemand;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    @Override
    public String toString() {
        return "Demand{" +
                "rateOfDemand='" + rateOfDemand + '\'' +
                ", supply=" + supply +
                '}';
    }

}
