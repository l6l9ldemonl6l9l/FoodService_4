package distributedsystems.foodService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import distributedsystems.foodService.model.Food;
import java.util.UUID;
import java.util.List;


@Service
public final class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository FoodRepository;

    @Override
    public Food addFood(Food Food) {
        Food savedFood = FoodRepository.save(Food);
        return savedFood;
    }

    @Override
    public List<Food> getAll() {
        return FoodRepository.findAll();
    }

    @Override
    public Food getById(UUID id) {
        Food Food = FoodRepository.findById(id).get();
        return Food;
    }

    @Override
    public Food getByName(String name) {
        return FoodRepository.findByName(name);
    }

    @Override
    public void deleteFoodById(UUID id) {
        FoodRepository.deleteById(id);
    }
}
