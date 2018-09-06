package com.survey.dao;

import com.survey.pojo.FUserBind;
import java.util.List;

public interface FUserBindMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FUserBind record);

    FUserBind selectByPrimaryKey(Integer id);

    List<FUserBind> selectAll();

    int updateByPrimaryKey(FUserBind record);
}