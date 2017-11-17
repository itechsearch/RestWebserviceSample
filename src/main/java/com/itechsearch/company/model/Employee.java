package com.itechsearch.company.model;

public class Employee {
    private Integer employeeid;
    private String companyName;
    private  String employeeName;
    private Integer Salarty;

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getSalarty() {
        return Salarty;
    }

    public void setSalarty(Integer salarty) {
        Salarty = salarty;
    }
}
