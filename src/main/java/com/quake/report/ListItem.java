package com.quake.report;

public class ListItem {
    private String mag;
    private String loc1;
    private String loc2;
    private String url;

    private String date;
    private String time;
    public ListItem(String mag,String loc1,String loc2,String date,String time,String url)
    {
        this.mag=mag;
        this.loc1=loc1;
        this.loc2=loc2;
        this.date=date;
        this.time=time;
        this.url=url;
    }
    public String getMag()
    {
        return mag;
    }
    public String getLoc1()
    {
        return loc1;
    }
    public String getLoc2()
    {
        return loc2;
    }
    public String getDate()
    {
        return date;
    }
    public String getTime()
    {
        return time;
    }
    public String getUrl()
    {
        return url;
    }

}
