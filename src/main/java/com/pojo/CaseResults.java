package com.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.*;

public class CaseResults {
    @SerializedName("entries")
    private List<Runs> runsList = new ArrayList<>();

    public List<Runs> getRunsList() {
        return runsList;
    }

    public void setRunsList(List<Runs> runsList) {
        this.runsList = runsList;
    }

}
