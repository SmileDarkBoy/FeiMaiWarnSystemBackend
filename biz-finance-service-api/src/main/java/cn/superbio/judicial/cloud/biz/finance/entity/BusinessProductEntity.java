package cn.superbio.judicial.cloud.biz.finance.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BusinessProductEntity {
    private Long id;
    private String deptname;
    private String pid;
    private Long catId;
    private Integer businessType;
    private String uploadUrl;
    private Integer state;
    private String totalprice;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date crtTime;
    private String remak;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    public Long getId() {
        return id;
    }

    public String getIdString() {
        return this.id == null ? "" : this.id.toString();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getCatIdString() {
        return this.catId == null ? "" : this.catId.toString();
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getRemak() {
        return remak;
    }

    public void setRemak(String remark) {
        this.remak = remark;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
