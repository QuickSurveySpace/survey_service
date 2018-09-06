package com.question.dao;

import com.question.pojo.CompanyArea;
import java.util.List;

public interface CompanyAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyArea record);

    CompanyArea selectByPrimaryKey(Integer id);

    List<CompanyArea> selectAll();

    int updateByPrimaryKey(CompanyArea record);
}