package com.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Employee_Test_Junit {
   EmployeeDetails emp;
    EmployeeDetails_Test emtest;

    public Employee_Test_Junit() {
        emp = new EmployeeDetails();
        emtest = new EmployeeDetails_Test();
    }

    //test to check appraisal
    @Test
    public void testCalculateAppraisal() {
        emp.setName("Tom");
        emp.setAge(25);
        emp.setMonthlySalary(8000);

        double appraisal = emtest.Emp_Annualsal(emp);
        assertEquals(500, appraisal, 0.0);
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {
        emp.setName("Tom");
        emp.setAge(25);
        emp.setMonthlySalary(8000);

        double salary = emtest.Emp_HikeCalculate(emp);
        assertEquals(96000, salary, 0.0);
    }
}