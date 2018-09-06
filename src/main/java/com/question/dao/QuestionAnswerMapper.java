package com.question.dao;

import com.question.pojo.QuestionAnswer;
import java.util.List;

public interface QuestionAnswerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionAnswer record);

    QuestionAnswer selectByPrimaryKey(Integer id);

    List<QuestionAnswer> selectAll();

    int updateByPrimaryKey(QuestionAnswer record);
}