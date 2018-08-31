package com.example.divinkas.cursapps.Retrofit;

import com.example.divinkas.cursapps.Model.P24;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IMyApi_P24 {
    @GET("p24api/exchange_rates")
    Observable<P24> getCurses(@Query("date") String date, @Query("json") String str);
}
