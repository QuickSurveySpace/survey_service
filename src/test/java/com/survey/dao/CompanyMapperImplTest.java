package com.survey.dao;

import com.survey.base.BaseTestClass;
import com.survey.pojo.Company;
import com.survey.pojo.query.CompanyQuery;
import org.junit.Test;

/**
 * Created by lenovo on 2018/9/6.
 */
public class CompanyMapperImplTest extends BaseTestClass {
    private CompanyMapper dao = (CompanyMapper) getInstance("companyMapper");


    private Company getCompany(){
        Company company = new Company();
        company.setName("肯德基");
        return company;
    }

    @Test
    public void insertCompany(){
        System.out.println(dao.insertCompany(getCompany()));
    }


    @Test
    public void  selectByPrimaryKey(){
        System.out.println(dao.selectByPrimaryKey(1));
    }

    @Test
    public void  selectAll(){
        System.out.println(dao.selectAll());
    }

    @Test
    public void  updateByPrimaryKey(){
        Company company = dao.selectByPrimaryKey(1);
        company.setName("麦当劳");
        dao.updateByPrimaryKey(company);
    }


    @Test
    public void  queryCompany(){
        CompanyQuery query = new CompanyQuery();
        query.setName("肯");
        System.out.println(dao.queryCompany(query));
    }

    @Test
    public void deleteByPrimaryKey(){
        dao.deleteByPrimaryKey(2);
    }
}
