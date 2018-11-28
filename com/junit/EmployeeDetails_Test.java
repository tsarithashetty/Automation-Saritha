package com.junit;

public class EmployeeDetails_Test {

     static double CalculateYearlySalary(EmployeeDetails emp) {
        double month_sal = emp.getMonthlySalary();
        double annual_sal = month_sal * 12;
        System.out.println("Aunual sal "+annual_sal+"- monthly sal"+month_sal);
        return annual_sal;
    }

     static double CalculateAppraisal(EmployeeDetails emp) {
        double sal = emp.getMonthlySalary();
        double hike;
        if (sal > 10000) {
            hike = 5000;
            System.out.println("Sal: "+sal+" Hike:"+hike);
        } else {
            hike = 2000;
            System.out.println("Sal: "+sal+" Hike:"+hike);
        }
        return hike;
    }

    /*public static void main(String []args){
        EmployeeDetails e= new EmployeeDetails();
        e.setMonthlySalary(1000);
        double ann = Emp_Annualsal(e);
        System.out.println(ann);
        System.out.println(Emp_HikeCalculate(e));
    }*/
}

