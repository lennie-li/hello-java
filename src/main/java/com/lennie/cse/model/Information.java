package com.lennie.cse.model;

import java.util.Date;

public class Information {
    private int id;
    private String title;
    private String receiver;
    private String content;
    private String creater;
    private Date datetime;

    @Override
    public String toString() {
        return "id : " + this.id + "\n" +
                "title : " + this.title + "\n" +
                "receiver : " + this.receiver + "\n" +
                "content : " + this.content + "\n" +
                "creater : " + this.creater + "\n" +
                "datetime : " + this.datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }
}
