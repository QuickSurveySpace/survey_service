package com.survey.dao.impl;

import com.survey.dao.BaseDAO;
import com.survey.dao.QuestionMapper;
import com.survey.pojo.Question;
import com.survey.pojo.query.QuestionQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository("questionMapper")
public class QuestionMapperImpl extends BaseDAO<Question> implements QuestionMapper {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.delete(id);
    }

    @Override
    public Question selectByPrimaryKey(Integer id) {
        return this.get(id);
    }

    @Override
    public int insertQuestion(Question record) {
        record.setcTime(new Date());
        return super.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Question record) {
        record.setmTime(new Date());
        return this.update(record);
    }

    @Override
    public PageHolder<Question> pageQueryQuestion(QuestionQuery query) {
        return this.pagedQuery("findByParams", query.getMap(), query.getPageIndex(), query.getPageSize());
    }

    @Override
    public List<Question> listQuestion(QuestionQuery query) {
        return this.findBy("listQuestion",query.getMap());
    }
}
