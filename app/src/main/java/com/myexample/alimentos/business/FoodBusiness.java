package com.myexample.alimentos.business;

import com.myexample.alimentos.entity.FoodEntity;
import com.myexample.alimentos.repository.FoodRepository;

import java.util.List;

public class FoodBusiness {

    public FoodEntity get(int id) {
        return new FoodRepository().get(id);
    }

    public List<FoodEntity> getList() {
        return new FoodRepository().getList();
    }

}
