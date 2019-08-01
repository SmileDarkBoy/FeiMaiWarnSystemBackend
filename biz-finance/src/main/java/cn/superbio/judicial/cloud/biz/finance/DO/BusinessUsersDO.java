package cn.superbio.judicial.cloud.biz.finance.DO;

import com.baomidou.mybatisplus.annotation.TableName;

//@TableName("business_users")
@TableName("tb_upc_users")
public class BusinessUsersDO {
    private String userid;
    /**
     * username;员工姓名
     */
    private String username;
    /**
     * webchart;编号
     */
    private String webchart;
    /**
     * usertype;员工职位
     */
    private String usertype;
    /**
     * telphone;联系电话
     */
    private String telphone;
    /**
     * deptcode;部门code
     */
    private String deptcode;


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

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }


    public String getWebchart() {
        return webchart;
    }

    public void setWebchart(String webchart) {
        this.webchart = webchart;
    }
}
