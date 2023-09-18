package com.myexample.alimentos.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myexample.alimentos.R;
import com.myexample.alimentos.entity.FoodEntity;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextName;
    private TextView mTextCalorie;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mTextName = itemView.findViewById(R.id.text_name);
        this.mTextCalorie = itemView.findViewById(R.id.text_calories);
    }

        public void bind(FoodEntity food) {
            this.mTextName.setText(food.getName());
            this.mTextCalorie.setText(String.valueOf(food.getCalories()));
        }
}
