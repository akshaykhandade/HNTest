package com.retrofitdemo.com.hntest;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RecyclerInterface {

    //@GET("johngov/partyquest/services/api_get_all_events.php")
    @GET("/api/users?page=2")

    Call<Items> getItems();

    public void getItemsList(Callback<List<Datum>> callback);


    @POST("/posts")
    Call <User> setUser(@Body User user);


}
