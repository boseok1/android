package org.com.instagramui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.MyVieHolder>{

    private static final String TAG = "profileAdapter";

    private List<Content> contents = new ArrayList<>();

    public void addContemt(Content content){
        contents.add(content);
    }

    @NonNull
    @Override
    public MyVieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_profile, parent, false);
        return new MyVieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVieHolder holder, int position) {

        Content content = contents.get(position);

    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public static class MyVieHolder extends RecyclerView.ViewHolder{

        private ImageView imageView2;
        public MyVieHolder(@NonNull View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.img_pro1);
        }
        public void  setContent(Content content) {
            imageView2.setImageResource(content.getImgResource());
        }
    }

}
