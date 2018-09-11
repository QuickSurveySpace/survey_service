package com.survey.pojo.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/9/11.
 */
public class QuestionQuery {

    private String title;

    private Integer companyId;

    private Integer createUserId;

    //区域id
    private Integer areaId;

    private Integer lastId;

    private int pageIndex = 1;

    private int pageSize = 20;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getLastId() {
        return lastId;
    }

    public void setLastId(int lastId) {
        this.lastId = lastId;
    }

    public Map<String,Object> getMap(){



        Map<String,Object> map = new HashMap<String, Object>();

        map.put("title",title);
        map.put("companyId",companyId);
        map.put("createUserId",createUserId);
        map.put("areaId",areaId);
        map.put("num",pageSize);
        map.put("lastId",lastId);

        return map;
    }
}
