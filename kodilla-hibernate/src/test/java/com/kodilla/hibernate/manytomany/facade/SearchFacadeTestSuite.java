package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchFacade searchFacade;

    @Test
    public void testSearchCompanies() {
        //GIVEN
        Company company1 = new Company("Rajska Plaza");
        Company company2 = new Company("Gruby Czarny Kot");
        Company company3 = new Company("123 i kropka");
        //WHEN
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        List<Company> result = searchFacade.searchCompanies("za");
        //THEN
        Assert.assertEquals(2, result.size());
        //CLEAN UP
        try {
            companyDao.delete(company1);
            companyDao.delete(company2);
            companyDao.delete(company3);
        } catch (Exception e) {
        }
    }

    @Test
    public void testSearchEmployees() {
        //GIVEN
        Employee employee1 = new Employee("Jan", "Tomaszewski");
        Employee employee2 = new Employee("Tomasz", "Jankowski");
        Employee employee3 = new Employee("Mateusz", "Nowak");
        //WHEN
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        List<Employee> result = searchFacade.searchEmployees("ski");
        //THEN
        Assert.assertEquals(2, result.size());
        //CLEAN UP
        try {
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
            employeeDao.delete(employee3);
        } catch (Exception e) {
        }
    }
}
