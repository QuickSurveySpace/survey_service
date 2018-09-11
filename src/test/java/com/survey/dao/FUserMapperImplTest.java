package com.survey.dao;

import com.survey.base.BaseTestClass;
import com.survey.pojo.FUser;
import com.survey.pojo.query.FUserQuery;
import org.junit.Test;

/**
 * Created by lenovo on 2018/9/6.
 */
public class FUserMapperImplTest extends BaseTestClass {
    private FUserMapper dao = (FUserMapper) getInstance("fUserMapper");


    private FUser getFUser(){
        FUser user = new FUser();
        user.setName("测试");
        user.setCompanyId(1);
        user.setUserName("001");
        user.setUserPwd("123456");
        user.setRole(FUser.ROLE_AREA);
        user.setRoleId(1);
        return user;
    }

    @Test
    public void insertFUser(){
        System.out.println(dao.insertFUser(getFUser()));
    }

    @Test
    public void selectByPrimaryKey(){
        System.out.println(dao.selectByPrimaryKey(1));
    }

    @Test
    public void checkPwd(){
        System.out.println(dao.checkPwd("001", "123456"));
    }

    @Test
    public void updateByPrimaryKey(){
        FUser user = dao.selectByPrimaryKey(1);
        user.setName("测试1");
        System.out.println(dao.updateByPrimaryKey(user));
    }


    @Test
    public void listFuser(){
        FUserQuery query = new FUserQuery();
        query.setName("1");
        query.setCompanyId(1);
        query.setRole(FUser.ROLE_AREA);
        query.setRoleId(1);
        System.out.println(dao.listFuser(query));
    }

    @Test
    public void deleteByPrimaryKey(){
        System.out.println(dao.deleteByPrimaryKey(1));
    }


}
