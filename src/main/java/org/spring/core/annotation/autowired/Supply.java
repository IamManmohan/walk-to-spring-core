package org.spring.core.annotation.autowired;

public class Supply {
    private String rateOfSupply;

    public Supply() {
        super();
    }

    public Supply(String rateOfSupply) {
        this.rateOfSupply = rateOfSupply;
    }

    public String getRateOfSupply() {
        return rateOfSupply;
    }

    public void setRateOfSupply(String rateOfSupply) {
        this.rateOfSupply = rateOfSupply;
    }

    @Override
    public String toString() {
        return "Supply{" +
                "rateOfSupply='" + rateOfSupply + '\'' +
                '}';
    }
}
