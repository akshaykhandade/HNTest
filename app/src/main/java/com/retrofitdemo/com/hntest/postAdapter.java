package com.retrofitdemo.com.hntest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class postAdapter extends RecyclerView.Adapter<postAdapter.postViewHolder> {


    private Context context;
    private List<Items.Response>  itemsList;


    public postAdapter(Context context, List<Items.Response> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }


    public void setMovieList(List<Items.Response> itemsList) {
        this.itemsList = itemsList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public postViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.post_layout,parent,false);
        return new postViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull postViewHolder holder, int position) {

        Items.Response items1 = itemsList.get(position);

        holder.title.setText(items1.getUser_id());

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class postViewHolder extends RecyclerView.ViewHolder {

       ImageView imageView;
       TextView title;

       public postViewHolder(@NonNull View itemView) {
           super(itemView);

           imageView = itemView.findViewById(R.id.imageView);
           title = itemView.findViewById(R.id.title);
       }

   }


}
