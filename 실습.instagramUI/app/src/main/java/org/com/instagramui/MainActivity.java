package org.com.instagramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private RecyclerView rvImg;

    private RecyclerView rvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        rvImg = findViewById(R.id.linearLayout4);

        instargramadapter adapter = new instargramadapter();
        adapter.addItem(new instargramImg("루다1", R.drawable.ruda));
        adapter.addItem(new instargramImg("루다2", R.drawable.ruda1));
        adapter.addItem(new instargramImg("루다3", R.drawable.ruda2));
        adapter.addItem(new instargramImg("루다4", R.drawable.ruda3));
        adapter.addItem(new instargramImg("루다5", R.drawable.ruda4));
        adapter.addItem(new instargramImg("루다6", R.drawable.ruda5));
        adapter.addItem(new instargramImg("루다7", R.drawable.ruda6));
        adapter.addItem(new instargramImg("루다8", R.drawable.ruda7));
        adapter.addItem(new instargramImg("루다9", R.drawable.ruda8));
        adapter.addItem(new instargramImg("루다10", R.drawable.ruda9));
        adapter.addItem(new instargramImg("루다11", R.drawable.ruda10));

        rvImg.setLayoutManager(new LinearLayoutManager(this));
        rvImg.setAdapter(adapter);


        rvContent = findViewById(R.id.linearLayout3);

        ContentAdapter adapter1 = new ContentAdapter();
        adapter1.addContemt(new Content("루다1", R.drawable.rudada1));
        adapter1.addContemt(new Content("루다2", R.drawable.rudada2));
        adapter1.addContemt(new Content("루다3", R.drawable.rudada3));
        adapter1.addContemt(new Content("루다4", R.drawable.rudada4));
        adapter1.addContemt(new Content("루다5", R.drawable.rudada5));
        adapter1.addContemt(new Content("루다6", R.drawable.rudada6));
        adapter1.addContemt(new Content("루다7", R.drawable.rudada7));
        adapter1.addContemt(new Content("루다8", R.drawable.rudada8));
        adapter1.addContemt(new Content("루다9", R.drawable.rudada9));
        adapter1.addContemt(new Content("루다10", R.drawable.rudada10));
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);

        rvContent.setLayoutManager(layoutManager1);
        rvContent.setAdapter(adapter1);
    }
}