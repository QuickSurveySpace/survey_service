package com.survey.dao.impl;

import com.survey.dao.BaseDAO;
import com.survey.dao.FUserMapper;
import com.survey.pojo.FUser;
import com.survey.pojo.query.FUserQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/9/11.
 */
@Repository("fUserMapper")
public class FUserMapperImpl extends BaseDAO<FUser> implements FUserMapper {

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return super.delete(userId);
    }

    @Override
    public int insertFUser(FUser record) {
        record.setcTime(new Date());
        return super.insert(record);
    }

    @Override
    public FUser selectByPrimaryKey(Integer userId) {
        return super.get(userId);
    }

    @Override
    public FUser checkPwd(String key, String pwd) {
        Map<String,Object> map = new HashMap<>();
        map.put("userName",key);
        map.put("phone",key);
        map.put("userPwd",pwd);
        return super.findUniqueBy("checkPwd",map);
    }

    @Override
    public int updateByPrimaryKey(FUser record) {
        record.setmTime(new Date());
        return super.update(record);
    }

    @Override
    public PageHolder<FUser> listFuser(FUserQuery query) {
        return super.pagedQuery("findByParams",query.getMap(),query.getPageIndex(),query.getPageSize());
    }
}
