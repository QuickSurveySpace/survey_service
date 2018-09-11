package com.survey.pojo.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/9/11.
 */
public class FUserQuery {

    private String userName;

    private String name;

    private String phone;

    private Integer companyId;

    private Integer role;

    private Integer roleId;

    private int pageIndex = 1;

    private int pageSize = 20;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

        map.put("userName",userName);
        map.put("name",name);
        map.put("phone",phone);
        map.put("companyId",companyId);
        map.put("role",role);
        map.put("roleId",roleId);

        return map;
    }
}
