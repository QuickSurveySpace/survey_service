package com.survey.dao;

import com.survey.pojo.FUser;
import com.survey.pojo.query.FUserQuery;
import com.youguu.core.util.PageHolder;

public interface FUserMapper {

    int deleteByPrimaryKey(Integer userId);

    int insertFUser(FUser record);

    FUser selectByPrimaryKey(Integer userId);

    /**
     *
     * @param key 用户名 或者 手机号码
     * @param pwd
     * @return
     */
    FUser checkPwd(String key,String pwd);




    int updateByPrimaryKey(FUser record);


    PageHolder<FUser> listFuser(FUserQuery query);
}