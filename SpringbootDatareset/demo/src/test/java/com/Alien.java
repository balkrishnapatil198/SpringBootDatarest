package com.telusko.demo.model;
public class Alien
{
    private int aid;
    private String aname;
    private String tech;
    public int getAid() {
        return aid;
        @Entity
    }
    public void setAid(int aid)
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    @Override
    public String toString() {
         return "Alien [aid=" + aid + ", aname=" +aname + "]";
    }
    }
}