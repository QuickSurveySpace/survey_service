package com.question.dao;

import com.question.pojo.FUser;
import java.util.List;

public interface FUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(FUser record);

    FUser selectByPrimaryKey(Integer userId);

    List<FUser> selectAll();

    int updateByPrimaryKey(FUser record);
}