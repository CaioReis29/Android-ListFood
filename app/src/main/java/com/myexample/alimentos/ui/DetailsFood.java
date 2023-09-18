package com.myexample.alimentos.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.myexample.alimentos.R;
import com.myexample.alimentos.business.FoodBusiness;
import com.myexample.alimentos.constants.FoodConstants;
import com.myexample.alimentos.entity.FoodEntity;

public class DetailsFood extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_food);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        // Elementos de interface
        this.mViewHolder.mTextName = findViewById(R.id.text_name);
        this.mViewHolder.mTextCalories = findViewById(R.id.text_calories);

        this.getData();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int id = bundle.getInt(FoodConstants.FOOD_ID);
            FoodEntity foodEntity = new FoodBusiness().get(id);

            this.mViewHolder.mTextName.setText(foodEntity.getName());
            this.mViewHolder.mTextCalories.setText(String.valueOf(foodEntity.getCalories()));
        }
    }

    private static class ViewHolder {
        TextView mTextName;
        TextView mTextCalories;
    }
}