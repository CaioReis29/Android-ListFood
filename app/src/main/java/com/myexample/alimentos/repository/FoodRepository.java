package com.myexample.alimentos.repository;

import com.myexample.alimentos.entity.FoodEntity;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {

    private List<FoodEntity> mListFood;

    public FoodRepository() {
        this.mListFood = new ArrayList<>();

        this.mListFood.add(new FoodEntity(0, "Arroz", 206));
        this.mListFood.add(new FoodEntity(1, "Feijão", 116));
        this.mListFood.add(new FoodEntity(2, "Carne de Frango Grelhada", 165));
        this.mListFood.add(new FoodEntity(3, "Carne de Porco Assada", 250));
        this.mListFood.add(new FoodEntity(4, "Salmão Grelhado", 206));
        this.mListFood.add(new FoodEntity(5, "Massa de Espaguete", 200));
        this.mListFood.add(new FoodEntity(6, "Batata Frita", 365));
        this.mListFood.add(new FoodEntity(7, "Brócolis Cozidos", 55));
        this.mListFood.add(new FoodEntity(8, "Ovos Cozidos", 68));
        this.mListFood.add(new FoodEntity(9, "Pão Integral", 69));
        this.mListFood.add(new FoodEntity(10, "Pizza de Pepperoni", 285));
        this.mListFood.add(new FoodEntity(11, "Hamburguer com Queijo", 303));
        this.mListFood.add(new FoodEntity(12, "Taco de Frango", 189));
        this.mListFood.add(new FoodEntity(13, "Sushi de Salmão", 48));
        this.mListFood.add(new FoodEntity(14, "Lasanha de Carne", 339));
        this.mListFood.add(new FoodEntity(15, "Salada Caesar", 360));
        this.mListFood.add(new FoodEntity(16, "Molho de Tomate", 74));
        this.mListFood.add(new FoodEntity(17, "Pudim de Chocolate", 150));
        this.mListFood.add(new FoodEntity(18, "Bolo de Morango", 243));
        this.mListFood.add(new FoodEntity(19, "Sorvete de Baunilha", 137));

    }

    public FoodEntity get(int id) {
        return this.mListFood.get(id);
    }

    public List<FoodEntity> getList() {
        return this.mListFood;
    }

}
