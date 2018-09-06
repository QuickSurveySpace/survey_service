package com.question.dao.impl;

import com.question.dao.BaseDAO;
import com.question.dao.CompanyMapper;
import com.question.pojo.Company;
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
        return 0;
    }

    @Override
    public Company selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Company> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Company record) {
        return 0;
    }

    @Override
    public int insertCompany(Company record) {
        record.setcTime(new Date());
        return this.insert(record);
    }
}
