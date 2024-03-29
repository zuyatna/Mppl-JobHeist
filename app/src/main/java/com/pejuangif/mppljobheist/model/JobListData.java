package com.pejuangif.mppljobheist.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class JobListData {

    @SerializedName("status")
    private String status;
    @SerializedName("jobs")
    private ArrayList<JobLists> jobListsArray;
    @SerializedName("message")
    private String message;

    public ArrayList<JobLists> getJobListsArray() {
        return jobListsArray;
    }

}
