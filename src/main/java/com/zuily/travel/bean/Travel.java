package com.zuily.travel.bean;

public class Travel {
    private Integer tid;

    private String tname;

    private String type;

    private Double fee;

    private String destination;

    private String starttime;

    private Byte daynum;

    private String username;

    private String userpicurl;

    private Byte state;

    private Integer look;

    private String torder;

    private String showpic;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public Byte getDaynum() {
        return daynum;
    }

    public void setDaynum(Byte daynum) {
        this.daynum = daynum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpicurl() {
        return userpicurl;
    }

    public void setUserpicurl(String userpicurl) {
        this.userpicurl = userpicurl == null ? null : userpicurl.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Integer getLook() {
        return look;
    }

    public void setLook(Integer look) {
        this.look = look;
    }

    public String getTorder() {
        return torder;
    }

    public void setTorder(String torder) {
        this.torder = torder == null ? null : torder.trim();
    }

    public String getShowpic() {
        return showpic;
    }

    public void setShowpic(String showpic) {
        this.showpic = showpic == null ? null : showpic.trim();
    }
}