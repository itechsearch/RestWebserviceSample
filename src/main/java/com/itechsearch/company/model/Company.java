package com.itechsearch.company.model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="company")
public class Company implements Serializable
{
    private static final long serialVersionUID=-1234567890L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyId;

    @Column(name = "company_name", nullable =false)
    private String name;
    @Column(name = "cmmi_level", nullable = true)
    private Integer CMMILevel;
    @Column(name = "employee_count", nullable = false)
    private Integer employeeCount;


    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCMMILevel() {
        return CMMILevel;
    }

    public void setCMMILevel(Integer CMMILevel) {
        this.CMMILevel = CMMILevel;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }



}
