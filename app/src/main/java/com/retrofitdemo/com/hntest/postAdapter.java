package com.retrofitdemo.com.hntest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class postAdapter extends RecyclerView.Adapter<postAdapter.postViewHolder> {


    private Context context;
    private List<Datum>  itemsList;


    public postAdapter(Context context, List<Datum> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }


    public void setMovieList(List<Datum> itemsList) {
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

        Datum items1 = itemsList.get(position);

        holder.title.setText(items1.getEmail());

        Glide.with(context).load(items1.getAvatar()).into(holder.imageView);




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
