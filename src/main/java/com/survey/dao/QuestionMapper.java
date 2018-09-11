package com.survey.dao;

import com.survey.pojo.Question;
import com.survey.pojo.query.QuestionQuery;
import com.youguu.core.util.PageHolder;

import java.util.List;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insertQuestion(Question record);

    Question selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Question record);

    PageHolder<Question> pageQueryQuestion(QuestionQuery query);

    List<Question> listQuestion(QuestionQuery query);
}