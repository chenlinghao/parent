package com.clh.bean;

public class Blog_classify {
    private Integer cid;
    private String bname;

    @Override
    public String toString() {
        return "Blog_classify{" +
                "cid=" + cid +
                ", bname='" + bname + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Blog_classify() {
    }

    public Blog_classify(Integer cid, String bname) {
        this.cid = cid;
        this.bname = bname;
    }
}
