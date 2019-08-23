package cn.superbio.judicial.cloud.biz.finance.DO;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
@TableName("equipment_series")
public class FeiMaiEquipmentSeriesDO {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;//数据id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long sId;//产品系列id
    private String sName;//系列名称
    private String remark;//备注
    private Integer status;//数据状态

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
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
