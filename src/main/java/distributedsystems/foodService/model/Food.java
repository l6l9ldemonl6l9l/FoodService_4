package distributedsystems.foodService.model;

import distributedsystems.Food.FoodRequest;
import distributedsystems.Food.FoodResponse;
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
    private String name;

    public Food() {
        id = UUID.randomUUID();
    }

    public Food(UUID id, int taste, String name) {
        this.taste = taste;
        this.name = name;
        this.id = id;
    }

    public static Food fromFoodRequest(FoodRequest foodRequest) {
        return new Food(UUID.randomUUID(),
                foodRequest.getTaste(),
                foodRequest.getName());
    }

    public FoodResponse toFoodResponse() {
        return FoodResponse.newBuilder().
                setId(id.toString()).
                setTaste(taste).
                setName(name).
                build();
    }
}
