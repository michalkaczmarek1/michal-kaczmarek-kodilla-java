package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SearchFacadeTest {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testSearchEmployee() {
        //Given
        Employee janKowalski = new Employee("Jan", "Kowalski");
        Employee janinaNowak = new Employee("Janina", "Nowak");

        Company streamsoft = new Company("Stremsoft");

        streamsoft.getEmployees().add(janKowalski);
        streamsoft.getEmployees().add(janinaNowak);

        janKowalski.getCompanies().add(streamsoft);
        janinaNowak.getCompanies().add(streamsoft);

        companyDao.save(streamsoft);

        //When
        List<Employee> employees = searchFacade.searchEmployee("wa");

        //Then
        assertEquals(2, employees.size());

        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    public void testSearchCompany() {
        //Given
        Employee janKowalski = new Employee("Jan", "Kowalski");
        Employee janinaNowak = new Employee("Janina", "Nowak");

        Company streamsoft = new Company("Streamsoft");

        streamsoft.getEmployees().add(janKowalski);
        streamsoft.getEmployees().add(janinaNowak);

        janKowalski.getCompanies().add(streamsoft);
        janinaNowak.getCompanies().add(streamsoft);

        companyDao.save(streamsoft);

        //When
        List<Company> companies = searchFacade.searchCompany("Stream");

        //Then
        assertEquals(1, companies.size());

        //CleanUp
        companyDao.deleteAll();
    }

}