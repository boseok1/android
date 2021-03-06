package org.com.instagramui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class instargramadapter extends RecyclerView.Adapter<instargramadapter.MyViewHolder> {

    private static final String TAG = "instargramadapter";

    private List<instargramImg> items = new ArrayList<>();

    public void addItem(instargramImg img) {
        items.add(img);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.layout_content,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        instargramImg img =items.get(position);
        holder.setItem(img);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.main_img);
        }
        public void setItem(instargramImg img) {
            imageView.setImageResource(img.getImgResource());
        }
    }
}
