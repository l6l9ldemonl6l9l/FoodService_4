package distributedsystems.foodService.model;

import distributedsystems.foodService.FoodRequest;
import distributedsystems.foodService.FoodResponse;
import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@EnableAutoConfiguration
@Entity
@Data
public final class Food {

    @Id
    private UUID id;
    @Column(unique = true)
    private int taste;
    private String kindFood;

    public Food() {
        id = UUID.randomUUID();
    }

    public Food(UUID id, int taste, String kindFood) {
        this.taste = taste;
        this.kindFood = kindFood;
        this.id = id;
    }

    public static Food fromFoodRequest(FoodRequest foodRequest) {
        return new Food(UUID.randomUUID(),
                foodRequest.getTaste(),
                foodRequest.getKindFood());
    }

    public FoodResponse toFoodResponse() {
        return FoodResponse.newBuilder().
                setId(id.toString()).
                setTaste(taste).
                setKindFood(kindFood).
                build();
    }
}
