package com.example.administrator.newrx;

/**
 * Created by Administrator on 2017/8/16.
 */

public class dataEntity {
    private int id;
    private String title;
    private int ctime;
    private int imgcount;
    private String imgurl;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCtime(int ctime) {
        this.ctime = ctime;
    }

    public void setImgcount(int imgcount) {
        this.imgcount = imgcount;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCtime() {
        return ctime;
    }

    public int getImgcount() {
        return imgcount;
    }

    public String getImgurl() {
        return imgurl;
    }

}
