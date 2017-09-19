package com.example.pc.pickersociss;


public class JobInWeek {
    private String title;
    private String desciption;
    private String dateFinish;
    private String hourFinish;

    public JobInWeek(String title, String desciption, String dateFinish, String hourFinish) {
        this.title = title;
        this.desciption = desciption;
        this.dateFinish = dateFinish;
        this.hourFinish = hourFinish;
    }

    public String getTitle() {
        return title;
    }

    public String getDesciption() {
        return desciption;
    }

    public String getDateFinish() {
        return dateFinish;
    }

    public String getHourFinish() {
        return hourFinish;
    }

    @Override
    public String toString() {
        return this.title+"-"+
                this.dateFinish+"-"+
                this.hourFinish;
    }
}