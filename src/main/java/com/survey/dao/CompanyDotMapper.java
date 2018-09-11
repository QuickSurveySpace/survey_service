package com.survey.dao;

import com.survey.pojo.CompanyDot;
import com.survey.pojo.query.CompanyDotQuery;
import com.youguu.core.util.PageHolder;

import java.util.List;

public interface CompanyDotMapper {
    int deleteByPrimaryKey(Integer id);

    int insertCompanyDot(CompanyDot record);

    CompanyDot selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(CompanyDot record);


    List<CompanyDot> listCompanyDot(CompanyDotQuery query);

    PageHolder<CompanyDot> queryCompanyDot(CompanyDotQuery query);
}