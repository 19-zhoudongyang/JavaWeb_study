package com.zdy.fruit.dao;

import com.zdy.fruit.pojo.Fruit;

import java.util.ArrayList;
import java.util.List;

public interface FruitDAO {
    public void addFruit(Fruit fruit);
    public ArrayList<Fruit> getFruitList();
}
