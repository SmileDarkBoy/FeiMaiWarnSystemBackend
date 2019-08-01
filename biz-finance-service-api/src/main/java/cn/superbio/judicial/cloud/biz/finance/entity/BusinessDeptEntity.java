package cn.superbio.judicial.cloud.biz.finance.entity;

public class BusinessDeptEntity {
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
