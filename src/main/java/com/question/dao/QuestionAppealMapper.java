package com.question.dao;

import com.question.pojo.QuestionAppeal;
import java.util.List;

public interface QuestionAppealMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionAppeal record);

    QuestionAppeal selectByPrimaryKey(Integer id);

    List<QuestionAppeal> selectAll();

    int updateByPrimaryKey(QuestionAppeal record);
}