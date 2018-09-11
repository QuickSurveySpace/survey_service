package com.survey.service;

import com.survey.pojo.Question;
import com.youguu.core.util.PageHolder;

import java.util.List;

public interface IQuestionService {
    int deleteByPrimaryKey(Integer id);

    int insert(Question record);

    Question selectByPrimaryKey(Integer id);


    int updateByPrimaryKey(Question record);

}
