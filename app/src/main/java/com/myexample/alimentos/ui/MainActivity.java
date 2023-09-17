package com.myexample.alimentos.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.myexample.alimentos.business.FoodBusiness;
import com.myexample.alimentos.entity.FoodEntity;
import com.myexample.alimentos.R;
import com.myexample.alimentos.repository.FoodRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewMolder =  new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<FoodEntity> list = new FoodBusiness().getList();

        this.mViewMolder.mRecyclerFood = findViewById(R.id.recycler_food);
    }

    private static class ViewHolder {
        RecyclerView mRecyclerFood;
    }
}