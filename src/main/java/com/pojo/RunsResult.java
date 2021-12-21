package com.pojo;

public class RunsResult {
    private Integer blocked_count;
    private Integer completed_on;
    private String config;

    public Integer getBlocked_count(){
        return blocked_count;
    }

    public void setBlocked_count(Integer blocked_count) {
        this.blocked_count = blocked_count;
    }

    public Integer getCompleted_on() {
        return completed_on;
    }

    public void setCompleted_on(Integer completed_on) {
        this.completed_on = completed_on;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }



}
