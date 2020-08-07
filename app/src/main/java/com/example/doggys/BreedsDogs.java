package com.example.doggys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BreedsDogs {

    @SerializedName("message")
    @Expose
public List<String> message = null;

    @SerializedName("status")
    @Expose
    public String status;

}


/* POJOOO*/
