package com.retrofitdemo.com.hntest;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface RecyclerInterface {

    @GET("johngov/partyquest/services/api_get_all_events.php")
    Call<Items> getItems();

    public void getItemsList(Callback<List<Items>> callback);


}
