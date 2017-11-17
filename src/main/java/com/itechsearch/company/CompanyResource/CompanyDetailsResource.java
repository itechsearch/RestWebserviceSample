package com.itechsearch.company.CompanyResource;

import com.itechsearch.company.model.Company;
import com.itechsearch.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyDetailsResource {
    @Autowired
    CompanyService companyService;

    @GetMapping("/get/{id}")
    public Company getCompanyDetails
            (@PathVariable Integer id) {
    return companyService.getCompany(id);

    }

    @PostMapping (value = "/add", produces = "application/json")
    public Company addCompanyDetails(@RequestBody Company company){
        return companyService.addCompany(company);
    }

    @PostMapping (value = "/update", produces = "application/json")
    public Company updateCompanyDetails(@RequestBody Company company){
        return companyService.updateCompany(company);
    }

    @DeleteMapping (value = "/delete/{id}", produces = "application/json")
    public String removeCompany(@PathVariable Integer id){
        return companyService.deleteCompanyById(id);

    }

    @DeleteMapping (value = "/delete", produces = "application/json")
    public String removeCompany(@RequestBody Company company){
        return companyService.deleteCompany(company);

    }



}