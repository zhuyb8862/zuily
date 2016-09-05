package com.zuily.banner.bean;

public class Banner {
    private Integer bid;

    private String btitle;

    private String bdsc;

    private Byte state;

    private Integer lookunm;

    private Integer border;

    private String type;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle == null ? null : btitle.trim();
    }

    public String getBdsc() {
        return bdsc;
    }

    public void setBdsc(String bdsc) {
        this.bdsc = bdsc == null ? null : bdsc.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Integer getLookunm() {
        return lookunm;
    }

    public void setLookunm(Integer lookunm) {
        this.lookunm = lookunm;
    }

    public Integer getBorder() {
        return border;
    }

    public void setBorder(Integer border) {
        this.border = border;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

	@Override
	public String toString() {
		return "Banner [bid=" + bid + ", btitle=" + btitle + ", bdsc=" + bdsc
				+ ", state=" + state + ", lookunm=" + lookunm + ", border="
				+ border + ", type=" + type + "]";
	}
    
}