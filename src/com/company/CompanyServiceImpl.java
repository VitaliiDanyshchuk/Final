package com.company;
/* Classame : FinalTest
 *
 * Date: 23.06.2020
 * @author: Vitaliy
 * @version: 1.1
 * */

import java.util.List;

    public class CompanyServiceImpl implements ICompanyService {

        public CompanyServiceImpl() {}

        @Override
        public Company getTopLevelParent(Company child) {
            Company topLevelCompany = child;
            while (child.getParent() != null) {
                child = child.getParent();
                topLevelCompany = child;
            }

            return topLevelCompany;
        }

        @Override
        public int getEmployeeCountForCompanyAndChildren
                (Company company, List<Company> companies)
        {
            return  company.getEmployeesCount() + companies.stream().mapToInt
                    (Company::getEmployeesCount).sum();
        }


    }

