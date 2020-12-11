package distributedsystems.foodService.api;

import distributedsystems.foodService.model.Food;
import distributedsystems.foodService.services.FoodService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Food")
@AllArgsConstructor
@NoArgsConstructor
public class FoodRestController {

    @Autowired
    private FoodService FoodService;

    @PostMapping
    public Food createFood(@RequestBody Food Food) {
        return FoodService.addFood(Food);
    }

    @GetMapping
    public List<Food> getAllFoods() {
        return FoodService.getAll();
    }

    @GetMapping(path = "{id}")
    public Food getFoodById(@PathVariable(value = "id") UUID id) {
        Food Food = FoodService.getById(id);
        return Food;
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteFood(@PathVariable(value = "id") UUID id)  {
        FoodService.deleteFoodById(id);
        return ResponseEntity.noContent().build();
    }

}
