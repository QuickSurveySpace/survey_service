package com.survey.dao.impl;

import com.survey.dao.BaseDAO;
import com.survey.dao.CompanyMapper;
import com.survey.pojo.Company;
import com.survey.pojo.query.CompanyQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2018/9/6.
 */
@Repository("companyMapper")
public class CompanyMapperImpl extends BaseDAO<Company> implements CompanyMapper{

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return super.delete(id);
    }

    @Override
    public Company selectByPrimaryKey(Integer id) {
        return super.get(id);
    }

    @Override
    public List<Company> selectAll() {
        return super.findBy("selectAll",null);
    }

    @Override
    public int updateByPrimaryKey(Company record) {
        record.setmTime(new Date());
        return super.update(record);
    }

    @Override
    public int insertCompany(Company record) {
        record.setcTime(new Date());
        return super.insert(record);
    }

    @Override
    public PageHolder<Company> queryCompany(CompanyQuery query) {
        return super.pagedQuery("findByParams",query.getMap(),query.getPageIndex(),query.getPageSize());
    }
}
