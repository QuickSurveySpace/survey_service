package com.survey.dao.impl;

import com.survey.dao.BaseDAO;
import com.survey.dao.CompanyDotMapper;
import com.survey.pojo.CompanyDot;
import com.survey.pojo.query.CompanyDotQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2018/9/11.
 */
@Repository("companyDotMapper")
public class CompanyDotMapperImpl extends BaseDAO<CompanyDot> implements CompanyDotMapper {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return super.delete(id);
    }

    @Override
    public int insertCompanyDot(CompanyDot record) {
        record.setcTime(new Date());
        return super.insert(record);
    }

    @Override
    public CompanyDot selectByPrimaryKey(Integer id) {
        return super.get(id);
    }

    @Override
    public int updateByPrimaryKey(CompanyDot record) {
        record.setmTime(new Date());
        return super.update(record);
    }

    @Override
    public List<CompanyDot> listCompanyDot(CompanyDotQuery query) {
        return super.findBy("listCompanyDot",query.getMap());
    }

    @Override
    public PageHolder<CompanyDot> queryCompanyDot(CompanyDotQuery query) {
        return super.pagedQuery("findByParams",query.getMap(),query.getPageIndex(),query.getPageSize());
    }
}
