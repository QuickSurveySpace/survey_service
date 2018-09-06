package com.question.dao;

import com.question.pojo.CompanyDot;
import java.util.List;

public interface CompanyDotMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyDot record);

    CompanyDot selectByPrimaryKey(Integer id);

    List<CompanyDot> selectAll();

    int updateByPrimaryKey(CompanyDot record);
}