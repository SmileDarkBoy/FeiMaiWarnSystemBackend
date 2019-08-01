package cn.superbio.judicial.cloud.biz.finance.DO;

import com.baomidou.mybatisplus.annotation.TableName;

//@TableName("business_department_info")
@TableName("tb_upc_department")
public class BusinessDeptDO {
    private String deptid;
    private String deptcode;
    private String deptname;
    private String parentdeptcode;

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getParentdeptcode() {
        return parentdeptcode;
    }

    public void setParentdeptcode(String parentdeptcode) {
        this.parentdeptcode = parentdeptcode;
    }
}
