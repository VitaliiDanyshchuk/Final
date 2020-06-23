package com.company;
/* Classame : FinalTest
 *
 * Date: 23.06.2020
 * @author: Vitaliy
 * @version: 1.1
 * */
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CompanyServiceImpl servise = new CompanyServiceImpl();

        Company chief = new Company(1,null,1);
        Company lawyer = new Company( 2,chief,5);
        Company developer = new Company( 3,chief,3);
        Company backEnd = new Company( 4,developer,3);
        Company devOps = new Company( 5,backEnd,2);
        Company frontEnd = new Company( 6,developer,5);
        Company design = new Company( 7,frontEnd,4);
        Company accounting = new Company(8,null,2);

       // System.out.println(frontEnd.getEmployeesCount() + " " +  frontEnd.getParent().toString());

        List<Company> companies = new ArrayList<>();
        companies.add(chief);
        companies.add(lawyer);
        companies.add(developer);
        companies.add(backEnd);
        companies.add(devOps);
        companies.add(frontEnd);
        companies.add(design);
        companies.add(accounting);


    }
}
