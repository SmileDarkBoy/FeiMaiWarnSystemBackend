package cn.superbio.judicial.cloud.biz.finance.DO;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("business_daily_product_info")
public class BusinessProductDO {
    private Long id;
    private String deptname;
    private String pid;
    private Long catId;
    private Integer businessType;
    private String uploadUrl;
    private Integer state;
    private String totalprice;
    private Date crtTime;
    private String remak;


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

}
