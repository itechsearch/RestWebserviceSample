package com.itechsearch.company.CompanyResource;

import com.itechsearch.company.model.Employee;
import jersey.repackaged.com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
    @GetMapping("/get/{id}")
    public Map<String, String> getCompanyDetails
            (@PathVariable Integer id) {
        Map<String,String> resultMap=new HashMap<>();
        resultMap.put("message", "employee details get");
        return resultMap;

    }


    @PostMapping(value = "/update/{id}", produces = "application/json")
    public Employee updateCompanyDetails(@PathVariable Integer id, @RequestBody Employee employee){
        employee.setEmployeeName("Updated employee");
        return employee;
    }

    @DeleteMapping (value = "/delete/{id}", produces = "application/json")
    public Map<String, Integer> removeCompany(@PathVariable Integer id){
        Map<String,Integer> textResult= Maps.newHashMap();
        textResult.put("deleted employee id",id);
        return textResult;
    }

}
