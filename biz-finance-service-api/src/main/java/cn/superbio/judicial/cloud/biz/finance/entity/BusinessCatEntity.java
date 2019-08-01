package cn.superbio.judicial.cloud.biz.finance.entity;


public class BusinessCatEntity {
    private Long id;
    private String name;
    private Integer gType;
    private Integer state;

    public Long getId() {
        return id;
    }

    public String getIdString() {
        return this.id == null ? "" : this.id.toString();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getgType() {
        return gType;
    }

    public void setgType(Integer gType) {
        this.gType = gType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
