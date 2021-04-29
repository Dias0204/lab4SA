package com.company;

public class AutoPart {
    private String partsname;
    private String price;

    public AutoPart(String partsname, String price){
        this.partsname = partsname;
        this.price = price;
    }

    public String getPartsname() {
        return partsname;
    }

    public void setPartsname(String partsname) {
        this.partsname = partsname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
