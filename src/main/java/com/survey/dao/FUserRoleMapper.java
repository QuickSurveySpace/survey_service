package com.survey.dao;

import com.survey.pojo.FUserRole;
import java.util.List;

public interface FUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FUserRole record);

    FUserRole selectByPrimaryKey(Integer id);

    List<FUserRole> selectAll();

    int updateByPrimaryKey(FUserRole record);
}