package com.survey.service.impl;

import com.survey.dao.QuestionMapper;
import com.survey.pojo.Question;
import com.survey.service.IQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("questionService")
public class QuestionServiceImpl implements IQuestionService {

    @Resource
    private QuestionMapper questionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return questionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Question record) {
        return questionMapper.insertQuestion(record);
    }

    @Override
    public Question selectByPrimaryKey(Integer id) {
        return questionMapper.selectByPrimaryKey(id);
    }


    @Override
    public int updateByPrimaryKey(Question record) {
        return questionMapper.updateByPrimaryKey(record);
    }


}
