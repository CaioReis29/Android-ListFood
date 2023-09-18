package com.myexample.alimentos.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.myexample.alimentos.adapter.FoodAdapter;
import com.myexample.alimentos.business.FoodBusiness;
import com.myexample.alimentos.entity.FoodEntity;
import com.myexample.alimentos.R;
import com.myexample.alimentos.repository.FoodRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<FoodEntity> list = new FoodBusiness().getList();

        // 1- Definir um Recycler view

        this.mViewHolder.mRecyclerFood = findViewById(R.id.recycler_food);

        // 2- Definir um adapter
        FoodAdapter adapter = new FoodAdapter(list);
        this.mViewHolder.mRecyclerFood.setAdapter(adapter);

        // 3- Layout
        this.mViewHolder.mRecyclerFood.setLayoutManager(new LinearLayoutManager(this));

    }

    private static class ViewHolder {
        RecyclerView mRecyclerFood;
    }
}