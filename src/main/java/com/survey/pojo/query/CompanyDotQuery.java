package com.survey.pojo.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/9/11.
 */
public class CompanyDotQuery {
    private Integer companyId;

    private Integer companyAreaId;

    private String name;

    private String dotCode;

    private int pageIndex = 1;

    private int pageSize = 20;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCompanyAreaId() {
        return companyAreaId;
    }

    public void setCompanyAreaId(Integer companyAreaId) {
        this.companyAreaId = companyAreaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDotCode() {
        return dotCode;
    }

    public void setDotCode(String dotCode) {
        this.dotCode = dotCode;
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
        map.put("companyAreaId",companyAreaId);
        map.put("dotCode",dotCode);
        return map;
    }
}
