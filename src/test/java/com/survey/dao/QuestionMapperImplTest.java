package com.survey.dao;

import com.survey.base.BaseTestClass;
import com.survey.pojo.Question;
import com.survey.pojo.query.QuestionQuery;
import org.junit.Test;

/**
 * Created by lenovo on 2018/9/6.
 */
public class QuestionMapperImplTest extends BaseTestClass {
    private QuestionMapper dao = (QuestionMapper) getInstance("questionMapper");


    private Question getQuestion(){
        Question question = new Question();
        question.setTitle("麦当劳问卷");
        question.setCompanyId(1);
        question.setCreateUserId(1);
        return question;
    }

    @Test
    public void insertQuestion(){
        System.out.println(dao.insertQuestion(getQuestion()));
    }

    @Test
    public void selectByPrimaryKey(){
        System.out.println(dao.selectByPrimaryKey(1));
    }

    @Test
    public void updateByPrimaryKey(){
        Question question = dao.selectByPrimaryKey(1);
        question.setTitle("肯德基问卷");
        System.out.println(dao.updateByPrimaryKey(question));
    }

    @Test
    public void pageQueryQuestion(){
        QuestionQuery query = new QuestionQuery();
        query.setTitle("肯");
        query.setCompanyId(1);
        System.out.println(dao.pageQueryQuestion(query));
    }

    @Test
    public void listQuestion(){
        QuestionQuery query = new QuestionQuery();
        query.setTitle("肯");
        query.setCompanyId(1);
        System.out.println(dao.listQuestion(query));
    }

    @Test
    public void deleteByPrimaryKey(){
        System.out.println(dao.deleteByPrimaryKey(2));
    }

}
