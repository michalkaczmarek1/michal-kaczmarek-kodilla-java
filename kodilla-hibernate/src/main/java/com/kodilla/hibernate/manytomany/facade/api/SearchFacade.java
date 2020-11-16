package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    @Autowired
    public SearchFacade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> searchEmployee(String name) {
        List<Employee> employees = employeeDao.searchEmployeeByPartName(name);
        return employees;
    }

    public List<Company> searchCompany(String name) {
        List<Company> companies = companyDao.searchCompanyByPartName(name);
        return companies;
    }
}
