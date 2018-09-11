package com.survey.dao;

import com.survey.base.BaseTestClass;
import com.survey.pojo.CompanyArea;
import com.survey.pojo.query.CompanyAreaQuery;
import org.junit.Test;

/**
 * Created by lenovo on 2018/9/6.
 */
public class CompanyAreaMapperImplTest extends BaseTestClass {
    private CompanyAreaMapper dao = (CompanyAreaMapper) getInstance("companyAreaMapper");


    private CompanyArea getCompanyArea(){
        CompanyArea company = new CompanyArea();
        company.setName("华南区域");
        company.setCompanyId(1);
        return company;
    }

    @Test
    public void insertCompany(){
        System.out.println(dao.insertCompanyAreaMapper(getCompanyArea()));
    }


    @Test
    public void  selectByPrimaryKey(){
        System.out.println(dao.selectByPrimaryKey(1));
    }
//
    @Test
    public void  updateByPrimaryKey(){
        CompanyArea companyArea = dao.selectByPrimaryKey(1);
        companyArea.setName("华东区域");
        System.out.println(dao.updateByPrimaryKey(companyArea));
    }

    @Test
    public void  queryByCompanyId(){
        System.out.println(dao.queryByCompanyId(1));
    }


    @Test
    public void queryCompanyArea(){
        CompanyAreaQuery query = new CompanyAreaQuery();
//        query.setName("南");
//        query.setCompanyId(2);
        System.out.println(dao.queryCompanyArea(query));
    }

    @Test
    public void deleteByPrimaryKey(){
        dao.deleteByPrimaryKey(2);
    }
}
