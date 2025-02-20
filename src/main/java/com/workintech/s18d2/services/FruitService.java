package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.FruitType;

import java.util.List;

public interface FruitService {
    List<Fruit> getByPriceDesc();
    List<Fruit> getByPriceAsc();
    Fruit getById(Long id);
    Fruit save(Fruit fruit);
    Fruit delete(Long id);
    List<Fruit> searchByName(String name);


}
