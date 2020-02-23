package com.retrofitdemo.com.hntest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Service;
import android.content.Intent;
import android.graphics.Movie;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
     ProgressBar pBar;
     postAdapter adapter;
    List<Items> itemsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        pBar=findViewById(R.id.pBar);

        itemsList = new ArrayList<>();


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



        getData();




    }

    private void getData() {

        RecyclerInterface apiService = ApiClient.getClient().create(RecyclerInterface.class);
        Call<Items> call = apiService.getItems();
        call.enqueue(new Callback<Items>() {
            @Override
            public void onResponse(retrofit2.Call<Items> call, Response<Items> response) {

                Log.d("qwerty","OnResponse: "
                        +response.isSuccessful()+" "+response.body());
                Toast.makeText(MainActivity.this, ""+response.body(), Toast.LENGTH_SHORT).show();

              List<Items.Response>  itemsList = response.body().getResponse();

              Items items = response.body();


                adapter = new postAdapter(getApplicationContext(),items.getResponse());

                adapter.setMovieList(itemsList);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(retrofit2.Call<Items> call, Throwable t) {
                Log.d("qwerty","onFailure: "+t);
            }

        });




    }


    class doSome extends Service {


        @Nullable
        @Override
        public IBinder onBind(Intent intent) {
            return null;
        }
    }

}
