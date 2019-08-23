package cn.superbio.judicial.cloud.biz.finance.DO;


import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.Date;

@TableName("monitor_data")
public class FeiMaiMonitorDataDO {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;//数据id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long projectNo;//项目编号
    private String projectName;//项目名称
    private String equipmentName;//设备名称
    private Date monitorTime;//监测时间
    private Float elevation;//高程
    private Float deformation;//变形量
    private Float accumulation;//累计
    private String remark;//备注
    private Integer status;//数据状态

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

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public Float getElevation() {
        return elevation;
    }

    public void setElevation(Float elevation) {
        this.elevation = elevation;
    }

    public Float getDeformation() {
        return deformation;
    }

    public void setDeformation(Float deformation) {
        this.deformation = deformation;
    }

    public Float getAccumulation() {
        return accumulation;
    }

    public void setAccumulation(Float accumulation) {
        this.accumulation = accumulation;
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
}
