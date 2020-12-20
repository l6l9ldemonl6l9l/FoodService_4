package distributedsystems.foodService.services;

import distributedsystems.foodService.model.Food;

import java.util.List;
import java.util.UUID;

public interface FoodService {
    Food addFood(Food Food);

    List<Food> getAll();

    Food getById(UUID id);

    Food getByName(String name);

    void deleteFoodById(UUID id);
}
