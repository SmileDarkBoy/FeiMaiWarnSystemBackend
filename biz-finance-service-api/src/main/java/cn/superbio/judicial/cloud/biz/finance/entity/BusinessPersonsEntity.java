package cn.superbio.judicial.cloud.biz.finance.entity;

public class BusinessPersonsEntity {
    private Long id;
    /**
     * userid;员工工号
     */
    private String userid;
    /**
     * username;员工姓名
     */
    private String username;
    /**
     * employeeNumber;编号
     */
    private String employeeNumber;
    /**
     * dept;部门名称
     */
    private String dept;
    /**
     * usertype;员工职位
     */
    private String usertype;
    /**
     * telphone;联系电话
     */
    private String telphone;
    /**
     * level权限级别
     */
    private String level;
    /**
     * level权限级别对应名称
     */
    private String levelname;
    /**
     * level权限级别对应部门code
     */
    private String leveldeptcode;
    /**
     * deptcode;部门code
     */
    private String deptcode;
    /**
     * remarks;备注
     */
    private String remarks;
    /**
     * state;1正常2删除
     */
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdString() {
        return this.id == null ? "" : this.id.toString();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

    public String getLeveldeptcode() {
        return leveldeptcode;
    }

    public void setLeveldeptcode(String leveldeptcode) {
        this.leveldeptcode = leveldeptcode;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
