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
            while (child.getParent() != null) {
                child = child.getParent();
            }

            return child;
        }

        @Override
        public int getEmployeeCountForCompanyAndChildren
                (Company company, List<Company> companies) {
            int employeeCount = company.getEmployeesCount();
            for (int i = 0; i < companies.size(); i++) {
                if (companies.get(i).getParent() == company) {
                    employeeCount += getEmployeeCountForCompanyAndChildren(companies.get(i), companies);
                }
            }
            return employeeCount;
        }

    }

