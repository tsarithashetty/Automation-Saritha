package com.junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Employee_Test_Junit {
   EmployeeDetails emp;
    EmployeeDetails_Test emtest;

    public Employee_Test_Junit() {
        emp = new EmployeeDetails();
        emtest = new EmployeeDetails_Test();
    }

    //test to check Yearly sal
    @Test
    public void testCalculateYearlySalary() {
        emp.setName("Tom");
        emp.setAge(25);
        emp.setMonthlySalary(2000);

        double ann_sal = emtest.CalculateYearlySalary(emp);
        assertEquals(24000, ann_sal, 0.0);
    }

    // test to check Appraisal
    @Test
    public void testCalculateAppraisal() {
        emp.setName("Tom");
        emp.setAge(25);
        emp.setMonthlySalary(3000);

        double salary = emtest.CalculateAppraisal(emp);
        assertEquals(2000, salary, 0.0);
    }
}
