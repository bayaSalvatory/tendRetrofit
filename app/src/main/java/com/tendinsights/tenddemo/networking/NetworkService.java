package com.tendinsights.tenddemo.networking;

import com.tendinsights.tenddemo.model.EventListResponse;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Rob on 4/6/17.
 */

public interface NetworkService {

    @GET("/events")
    Observable<EventListResponse> getEventList();
}

