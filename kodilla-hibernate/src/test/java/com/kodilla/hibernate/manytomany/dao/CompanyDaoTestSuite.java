package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    void testNamedQueryCompany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);


        //When
        List<Company> retrieveNameCompaniesAfterFirstThreeCharacters = companyDao.retrieveComapniesFirstThreeCharacters("Sof");

        //Then
        assertEquals(1, retrieveNameCompaniesAfterFirstThreeCharacters.size());

        // clean up
        companyDao.deleteAll();
    }

    @Test
    void testNamedQueryCompanyEmpty() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");

        Company softwareMachine = new Company("Software Machine");

        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(stephanieClarckson);


        johnSmith.getCompanies().add(softwareMachine);
        stephanieClarckson.getCompanies().add(softwareMachine);

        companyDao.save(softwareMachine);

        //When
        companyDao.delete(softwareMachine);
        List<Company> retrieveNameCompaniesAfterFirstThreeCharacters = companyDao.retrieveComapniesFirstThreeCharacters("Sof");

        //Then
        assertEquals(0, retrieveNameCompaniesAfterFirstThreeCharacters.size());

        // clean up
        employeeDao.deleteAll();
    }

    @Test
    void testNamedQueryEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Employee> retrieveLastnameEmployees = employeeDao.retrieveEmployeeEqualLastname(johnSmith.getLastname());

        //Then
        assertEquals(1, retrieveLastnameEmployees.size());

        // clean up
        companyDao.deleteAll();
    }

    @Test
    void testNamedQueryEmployeeEmpty() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");

        Company softwareMachine = new Company("Software Machine");

        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(stephanieClarckson);


        johnSmith.getCompanies().add(softwareMachine);
        stephanieClarckson.getCompanies().add(softwareMachine);

        companyDao.save(softwareMachine);

        //When
        employeeDao.delete(johnSmith);
        List<Employee> retrieveLastnameEmployees = employeeDao.retrieveEmployeeEqualLastname(johnSmith.getLastname());

        //Then
        assertEquals(0, retrieveLastnameEmployees.size());

        // clean up
        companyDao.deleteAll();
    }
}