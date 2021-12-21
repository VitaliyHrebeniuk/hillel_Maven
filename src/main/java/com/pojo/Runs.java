package com.pojo;

import com.google.gson.annotations.SerializedName;

public class Runs {
    private String id;
    private String description;
    private String name;
    @SerializedName("runs")
    private RunsResult runsResult;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RunsResult getRunsResult() {
        return runsResult;
    }

    public void setRunsResult(RunsResult runsResult) {
        this.runsResult = runsResult;
    }
}
