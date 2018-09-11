package com.survey.dao;

import com.survey.pojo.Company;
import com.survey.pojo.query.CompanyQuery;
import com.youguu.core.util.PageHolder;

import java.util.List;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insertCompany(Company record);

    Company selectByPrimaryKey(Integer id);

    List<Company> selectAll();

    int updateByPrimaryKey(Company record);


    PageHolder<Company> queryCompany(CompanyQuery query);
}