package com.example.gk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterGhe adapterGhe;
    private List<Ghe> listGhe=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getListProduct();

        recyclerView=findViewById(R.id.listGhe);
        adapterGhe=new AdapterGhe(listGhe, this);
        recyclerView.setAdapter(adapterGhe);
        GridLayoutManager linearLayoutManager=new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(linearLayoutManager);

    }
    private void getListProduct() {
        listGhe.add(new Ghe("Matteo Armchair", "$550", R.drawable.image1));
        listGhe.add(new Ghe("Morden Armchair", "$350", R.drawable.images2));
        listGhe.add(new Ghe("Nice Armchair", "$250", R.drawable.images3));
        listGhe.add(new Ghe("Circle Armchair", "$350", R.drawable.image4));

    }
}