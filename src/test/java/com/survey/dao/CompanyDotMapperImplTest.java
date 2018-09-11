package com.survey.dao;

import com.survey.base.BaseTestClass;
import com.survey.pojo.CompanyDot;
import com.survey.pojo.query.CompanyDotQuery;
import org.junit.Test;

/**
 * Created by lenovo on 2018/9/6.
 */
public class CompanyDotMapperImplTest extends BaseTestClass {
    private CompanyDotMapper dao = (CompanyDotMapper) getInstance("companyDotMapper");


    private CompanyDot getCompanyDot(){
        CompanyDot company = new CompanyDot();
        company.setName("北京西站店");
        company.setCompanyId(1);
        company.setCompanyAreaId(1);
        company.setDotCode("bjxz");
        return company;
    }

    @Test
    public void insertCompanyDot(){
        System.out.println(dao.insertCompanyDot(getCompanyDot()));
    }

    @Test
    public void selectByPrimaryKey(){
        System.out.println(dao.selectByPrimaryKey(1));
    }

    @Test
    public void updateByPrimaryKey(){
        CompanyDot companyDot = dao.selectByPrimaryKey(1);
        companyDot.setName("北京南站店");
        System.out.println(dao.updateByPrimaryKey(companyDot));
    }

    @Test
    public void listCompanyDot(){
        CompanyDotQuery query = new CompanyDotQuery();
//        query.setCompanyId(1);
//        query.setCompanyAreaId(1);
//        query.setDotCode("bjxz");
//        query.setName("南");
        System.out.println(dao.listCompanyDot(query));
    }

    @Test
    public void queryCompanyDot(){
        CompanyDotQuery query = new CompanyDotQuery();
        query.setCompanyId(1);
        query.setCompanyAreaId(1);
        query.setDotCode("bjxz");
        query.setName("南1");
        System.out.println(dao.queryCompanyDot(query));
    }



    @Test
    public void deleteByPrimaryKey(){
        dao.deleteByPrimaryKey(2);
    }
}
