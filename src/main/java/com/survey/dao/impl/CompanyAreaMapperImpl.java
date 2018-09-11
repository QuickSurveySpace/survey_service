package com.survey.dao.impl;

import com.survey.dao.BaseDAO;
import com.survey.dao.CompanyAreaMapper;
import com.survey.pojo.CompanyArea;
import com.survey.pojo.query.CompanyAreaQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2018/9/11.
 */
@Repository("companyAreaMapper")
public class CompanyAreaMapperImpl extends BaseDAO<CompanyArea> implements CompanyAreaMapper {

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return super.delete(id);
    }

    @Override
    public int insertCompanyAreaMapper(CompanyArea record) {
        record.setcTime(new Date());
        return super.insert(record);
    }

    @Override
    public CompanyArea selectByPrimaryKey(Integer id) {
        return super.get(id);
    }



    @Override
    public int updateByPrimaryKey(CompanyArea record) {
        record.setmTime(new Date());
        return super.update(record);
    }

    @Override
    public List<CompanyArea> queryByCompanyId(int companyId) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("companyId",companyId);
        return super.findBy("queryByCompanyId",map);
    }

    @Override
    public PageHolder<CompanyArea> queryCompanyArea(CompanyAreaQuery query) {
        return super.pagedQuery("findByParams",query.getMap(),query.getPageIndex(),query.getPageSize());
    }
}
