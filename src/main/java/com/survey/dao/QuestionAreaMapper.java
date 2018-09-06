package com.survey.dao;

import com.survey.pojo.QuestionArea;
import java.util.List;

public interface QuestionAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionArea record);

    QuestionArea selectByPrimaryKey(Integer id);

    List<QuestionArea> selectAll();

    int updateByPrimaryKey(QuestionArea record);
}