package com.survey.dao;

import com.survey.base.BaseTestClass;
import com.survey.pojo.Company;
import org.junit.Test;

/**
 * Created by lenovo on 2018/9/6.
 */
public class CompanyMapperImplTest extends BaseTestClass {
    private CompanyMapper dao = (CompanyMapper) getInstance("companyMapper");


    private Company getCompany(){
        Company company = new Company();
        company.setName("测试");
        return company;
    }

    @Test
    public void insertCompany(){
        System.out.println(dao.insertCompany(getCompany()));
    }
}
