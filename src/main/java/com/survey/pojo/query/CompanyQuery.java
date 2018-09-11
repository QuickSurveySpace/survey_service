package com.survey.pojo.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/9/10.
 */
public class CompanyQuery {

    private String name;

    private int pageIndex = 1;

    private int pageSize = 20;

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

        return map;
    }


}
