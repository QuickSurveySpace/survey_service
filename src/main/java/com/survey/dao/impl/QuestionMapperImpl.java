package com.survey.dao.impl;

import com.survey.dao.BaseDAO;
import com.survey.dao.QuestionMapper;
import com.survey.pojo.Question;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
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
    public List<Question> selectAll() {
        return this.getAll();
    }

    @Override
    public int updateByPrimaryKey(Question record) {
        return this.update(record);
    }

    @Override
    public PageHolder<Question> pageQueryQuestion(String title, int pageIndex, int pageSize) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("title", title);
        return this.pagedQuery("findByParams", map, pageIndex, pageSize);
    }
}
