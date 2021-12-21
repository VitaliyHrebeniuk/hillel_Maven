package com.pojo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class CaseModelConstructor {
    public static void main(String[] args) {
        CaseModelConstructor caseModelConstructor = new CaseModelConstructor();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(caseModelConstructor.getCaseModel()));
    }
    public CaseResults getCaseModel(){
        RunsResult runsResult = new RunsResult();
        runsResult.setBlocked_count(0);
        runsResult.setCompleted_on(null);
        runsResult.setConfig("Firefox, Ubuntu 12");

        Runs runs = new Runs();
        runs.setId("3933d74b-4282-4c1f-be62-a641ab427063");
        runs.setDescription("some description");
        runs.setName("File Formats");
        runs.setRunsResult(runsResult);

        java.util.List<Runs> runsList = new ArrayList<>();
        runsList.add(runs);

        CaseResults caseResults = new CaseResults();
        caseResults.setRunsList(runsList);
        return caseResults;

    }
}
