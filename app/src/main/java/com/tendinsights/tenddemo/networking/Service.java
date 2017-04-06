package com.tendinsights.tenddemo.networking;

import com.tendinsights.tenddemo.model.EventListResponse;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Rob on 4/6/17.
 */

public class Service {

    private final NetworkService networkService;

    public Service(NetworkService networkService) {
        this.networkService = networkService;
    }

    public Subscription getEventsList(final OnEventRetrievalListener listener) {

        return this.networkService.getEventList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onErrorResumeNext(new Func1<Throwable, Observable<? extends EventListResponse>>() {
                    @Override
                    public Observable<? extends EventListResponse> call(Throwable throwable) {
                        return Observable.error(throwable);
                    }
                })
                .subscribe(new Subscriber<EventListResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onEventRetrievalFailed();
                    }

                    @Override
                    public void onNext(EventListResponse eventListResponse) {
                        listener.onEventRetrievalSucceeded(eventListResponse);
                    }
                });

    }

    public interface OnEventRetrievalListener {
        void onEventRetrievalSucceeded(EventListResponse eventListResponse);

        void onEventRetrievalFailed();
    }


}
