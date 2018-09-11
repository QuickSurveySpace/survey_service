package com.survey.dao;

import com.survey.pojo.CompanyArea;
import com.survey.pojo.query.CompanyAreaQuery;
import com.youguu.core.util.PageHolder;

import java.util.List;

public interface CompanyAreaMapper {

    int deleteByPrimaryKey(Integer id);

    int insertCompanyAreaMapper(CompanyArea record);

    CompanyArea selectByPrimaryKey(Integer id);


    int updateByPrimaryKey(CompanyArea record);

    List<CompanyArea> queryByCompanyId(int companyId);

    PageHolder<CompanyArea> queryCompanyArea(CompanyAreaQuery query);
}