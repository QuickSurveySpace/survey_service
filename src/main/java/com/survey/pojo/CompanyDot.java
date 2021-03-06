package com.survey.pojo;

import java.util.Date;

public class CompanyDot {
    private Integer id;

    private Integer companyId;

    private Integer companyAreaId;

    private String name;

    private String address;

    private String dotCode;

    private String tel;

    private String banner;

    private Date cTime;

    private Date mTime;

    private Long seq;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner == null ? null : banner.trim();
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public String getDotCode() {
        return dotCode;
    }

    public void setDotCode(String dotCode) {
        this.dotCode = dotCode;
    }

    @Override
    public String toString() {
        return "CompanyDot{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", companyAreaId=" + companyAreaId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dotCode='" + dotCode + '\'' +
                ", tel='" + tel + '\'' +
                ", banner='" + banner + '\'' +
                ", cTime=" + cTime +
                ", mTime=" + mTime +
                ", seq=" + seq +
                '}';
    }
}