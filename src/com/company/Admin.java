package com.company;

public class Admin {
    private String addparts;
    private String deleteparts;
    private String asd;

    public Admin(String addparts, String deleteparts, String asd) {
        this.addparts = addparts;
        this.deleteparts = deleteparts;
        this.deleteparts = asd;

    }

    public String getAddparts() {
        return addparts;
    }

    public void setAddparts(String addparts) {
        this.addparts = addparts;
    }

    public String getDeleteparts() {
        return deleteparts;
    }

    public void setDeleteparts(String deleteparts) {
        this.deleteparts = deleteparts;
    }
}
