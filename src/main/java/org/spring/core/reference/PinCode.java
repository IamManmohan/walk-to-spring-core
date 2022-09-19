package org.spring.core.reference;

public class PinCode {
    private int pinCode;

    public PinCode() {
        super();
    }

    public PinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "PinCode{" +
                "pinCode=" + pinCode +
                '}';
    }
}
