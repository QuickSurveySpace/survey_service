package com.survey.dao;

import com.survey.pojo.QuestionDot;
import java.util.List;

public interface QuestionDotMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionDot record);

    QuestionDot selectByPrimaryKey(Integer id);

    List<QuestionDot> selectAll();

    int updateByPrimaryKey(QuestionDot record);
}