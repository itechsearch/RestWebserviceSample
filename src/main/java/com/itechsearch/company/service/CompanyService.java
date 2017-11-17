package com.itechsearch.company.service;

import com.itechsearch.company.model.Company;
import com.itechsearch.company.repo.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public Company addCompany(Company company){
        return  companyRepository.save(company);
    }

    public Company getCompany(Integer companyId){
        return companyRepository.findOne(companyId);
    }

    public Company updateCompany(Company company){
        return companyRepository.save(company);
    }

    public  String deleteCompanyById(Integer companyId){

        if(companyRepository.exists(companyId)) {
            companyRepository.delete(companyId);
            return "SUCCESS";
        }
        return  "FAILURE";
    }

    public  String deleteCompany(Company company){
        if(companyRepository.exists(company.getCompanyId())) {
            companyRepository.delete(company);
            return "SUCCESS";
        }
        return  "FAILURE";
    }
}
