package cn.superbio.judicial.cloud.biz.finance.entity;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class FeiMaiEquipmentEntity {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;//数据id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long eId;//设备编号
    private String eName;//设备名称
    private String eParameter;//设备参数
    @JsonSerialize(using = ToStringSerializer.class)
    private Long eSeriesid;//设备系列id
    private String eIntroduction;//设备简介
    private String remark;//备注
    private Integer status;//数据状态

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long geteId() {
        return eId;
    }

    public void seteId(Long eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteParameter() {
        return eParameter;
    }

    public void seteParameter(String eParameter) {
        this.eParameter = eParameter;
    }

    public Long geteSeriesid() {
        return eSeriesid;
    }

    public void seteSeriesid(Long eSeriesid) {
        this.eSeriesid = eSeriesid;
    }

    public String geteIntroduction() {
        return eIntroduction;
    }

    public void seteIntroduction(String eIntroduction) {
        this.eIntroduction = eIntroduction;
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
