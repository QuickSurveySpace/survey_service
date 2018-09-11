package com.survey.pojo.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/9/11.
 */
public class CompanyAreaQuery {
    private Integer companyId;

    private String name;

    private int pageIndex = 1;

    private int pageSize = 20;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Map<String,Object> getMap(){

        Map<String,Object> map = new HashMap<String, Object>();

        map.put("name",name);

        map.put("companyId",companyId);

        return map;
    }
}
