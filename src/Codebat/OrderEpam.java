package Codebat;

import java.util.List;
import java.util.stream.Collectors;

public class OrderEpam {

    record Order (long orderId, double amount) {}

    public static void main(String[] args) {
        List<Order> orders = List.of(new Order(1,50), new Order(5,70), new Order(7,50));
        var result =orders.stream()
                .filter(o -> o.orderId() < 7)
                .collect(Collectors.groupingBy(Order::orderId))
                .keySet();
        System.out.println(result);
    }
    //the result is 1, 5

}
