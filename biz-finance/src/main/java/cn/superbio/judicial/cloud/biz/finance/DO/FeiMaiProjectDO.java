package cn.superbio.judicial.cloud.biz.finance.DO;


import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.Date;
@TableName("project")
public class FeiMaiProjectDO {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;//数据id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long projectNo;//项目编号
    private String projectName;//项目名称
    private String projectType;//项目类型
    private String projectArea;//项目区域
    private String projectAddress;//项目地址
    private Date projectDate;//项目时间
    private String projectDuration;//项目周期
    private String projectLeader;//项目负责人
    private Integer projectState;//项目状态
    private String remark;//备注
    private Integer status;//数据状态
    private String supervisionUnit;//监理单位
    private String monitorProgram;//监测项目

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(Long projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectArea() {
        return projectArea;
    }

    public void setProjectArea(String projectArea) {
        this.projectArea = projectArea;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public Date getProjectDate() {
        return projectDate;
    }

    public void setProjectDate(Date projectDate) {
        this.projectDate = projectDate;
    }

    public String getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(String projectDuration) {
        this.projectDuration = projectDuration;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public Integer getProjectState() {
        return projectState;
    }

    public void setProjectState(Integer projectState) {
        this.projectState = projectState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSupervisionUnit() {
        return supervisionUnit;
    }

    public void setSupervisionUnit(String supervisionUnit) {
        this.supervisionUnit = supervisionUnit;
    }

    public String getMonitorProgram() {
        return monitorProgram;
    }

    public void setMonitorProgram(String monitorProgram) {
        this.monitorProgram = monitorProgram;
    }
}
