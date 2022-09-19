package org.spring.core.reference;

public class DetailedAddress {
    private String Address;
    private PinCode pinCode;

    public DetailedAddress() {
        super();
    }

    public DetailedAddress(String address, PinCode pinCode) {
        Address = address;
        this.pinCode = pinCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public PinCode getPinCode() {
        return pinCode;
    }

    public void setPinCode(PinCode pincode) {
        this.pinCode = pincode;
    }

    @Override
    public String toString() {
        return "DetailedAddress{" +
                "Address='" + Address + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
