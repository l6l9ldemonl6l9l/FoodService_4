package distributedsystems.foodService.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import distributedsystems.foodService.model.Food;
import java.util.UUID;

@Repository
public interface FoodRepository extends JpaRepository <Food, UUID > {
    Food findByName(String kindFood);
    Food findByFoodId(UUID id);
}
