package com.tendinsights.tenddemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rob on 4/6/17.
 */

public class EventListResponse {

    @Expose
    @SerializedName("items")
    private List<Event> eventsList;


    public List<Event> getEventsList (){
        return this.eventsList;
    }

}
