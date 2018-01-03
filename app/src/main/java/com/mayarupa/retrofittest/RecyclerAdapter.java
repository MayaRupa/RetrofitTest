package com.mayarupa.retrofittest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by reza on 03/01/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Image> images;

    public RecyclerAdapter(List<Image> images){
        this.images = images;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Name.setText(images.get(position).getName());
        holder.ImageUrl.setText(images.get(position).getUrl());

    }

    @Override
    public int getItemCount() {
        return images.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Name,ImageUrl;

        public MyViewHolder(View itemView) {
            super(itemView);
            Name =(TextView)itemView.findViewById(R.id.title);
            ImageUrl =(TextView)itemView.findViewById(R.id.imageViewID);
        }
    }
}
