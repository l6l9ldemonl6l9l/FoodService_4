package distributedsystems.foodService.api;

import distributedsystems.foodService.*;
import distributedsystems.foodService.model.Food;
import distributedsystems.foodService.services.FoodService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@GRpcService
public class FoodGrpcController extends FoodServiceGrpc.FoodServiceImplBase {


    @Autowired
    private FoodService FoodService;

    @Override
    public void all(AllFoodRequest request, StreamObserver<AllFoodResponse> responseObserver) {
        List<Food> dish = FoodService.getAll();
        List<FoodResponse> convertedDish = dish.stream().
                map(Food::toFoodResponse).
                collect(Collectors.toList());
        AllFoodResponse response = AllFoodResponse.newBuilder().
                addAllFood(convertedDish).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void add(FoodRequest request, StreamObserver<FoodResponse> responseObserver) {
        Food food = FoodService.addFood(Food.fromFoodRequest(request));
        responseObserver.onNext(food.toFoodResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void byId(FoodByIdRequest request, StreamObserver<FoodResponse> responseObserver) {
        Food Food = FoodService.getById(UUID.fromString(request.getId()));
        responseObserver.onNext(Food.toFoodResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void byName(FoodByNameRequest request, StreamObserver<FoodResponse> responseObserver) {
        Food Food = FoodService.getByName(request.getKindFood());
        responseObserver.onNext(Food.toFoodResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void delete(FoodByIdRequest request, StreamObserver<DeleteFoodResponse> responseObserver) {
        FoodService.deleteFoodById(UUID.fromString(request.getId()));
        responseObserver.onNext(DeleteFoodResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}
