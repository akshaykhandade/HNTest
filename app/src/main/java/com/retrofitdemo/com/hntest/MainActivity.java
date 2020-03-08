package com.retrofitdemo.com.hntest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
     ProgressBar pBar;
     postAdapter adapter;
    List<Datum> itemsList;


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



        //getData();
        setData();

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

              List<Datum>  itemsList = response.body().getData();


                adapter = new postAdapter(getApplicationContext(),itemsList);

                adapter.setMovieList(itemsList);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(retrofit2.Call<Items> call, Throwable t) {
                Log.d("qwerty","onFailure: "+t);
            }

        });




    }

    private void setData() {

        RecyclerInterface apiService = ApiClient.getClient().create(RecyclerInterface.class);

        User user= new User(12,"hey akkinenni ", " whats going on bro?");

        Call<User> call = apiService.setUser(user);


        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(retrofit2.Call<User> call, Response<User> response) {

                if (!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "error occurred "+response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }

                User user1 = response.body();

                Toast.makeText(MainActivity.this, "user1 "+user1, Toast.LENGTH_SHORT).show();

                Log.d("qwerty","onResponse: isSuccessfull: "+response.isSuccessful()
                        + " response: "+response.body().getId());

            }

            @Override
            public void onFailure(retrofit2.Call<User> call, Throwable t) {
                Log.d("qwerty","onFailure: "+t);
            }

        });




    }



}
