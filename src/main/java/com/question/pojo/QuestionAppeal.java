package com.question.pojo;

import java.util.Date;

public class QuestionAppeal {
    private Integer id;

    private Integer questionId;

    private String content;

    private String img;

    private Integer userId;

    private Integer areaRole;

    private String userName;

    private Integer headImgUrl;

    private Integer flag;

    private Date cTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAreaRole() {
        return areaRole;
    }

    public void setAreaRole(Integer areaRole) {
        this.areaRole = areaRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(Integer headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }
}