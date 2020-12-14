package distributedsystems.foodService.rabbitmq;


import distributedsystems.foodService.model.Food;
import distributedsystems.foodService.services.FoodService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    FoodService FoodService;

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void consume(Food Food) {
        FoodService.addFood(Food);
    }
}
