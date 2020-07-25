package com.clh.bean;

public class Blog_list {
    private Integer lid;
    private String title;
    private String label;
    private String article;
    private Integer cid;

    @Override
    public String toString() {
        return "Blog_list{" +
                "lid=" + lid +
                ", title='" + title + '\'' +
                ", label='" + label + '\'' +
                ", article='" + article + '\'' +
                ", cid=" + cid +
                '}';
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Blog_list() {
    }

    public Blog_list(Integer lid, String title, String label, String article, Integer cid) {
        this.lid = lid;
        this.title = title;
        this.label = label;
        this.article = article;
        this.cid = cid;
    }
}
