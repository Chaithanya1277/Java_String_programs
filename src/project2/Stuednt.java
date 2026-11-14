package project2;

import java.util.*;

record Order(String item, int quantity, double price) {

    public double total() {
        return quantity * price;
    }
}

class OrderProcessor {

    public Map<String, Double> summarize(List<Order> orders) {

        Map<String, Double> result = new HashMap<>();

        for (Order order : orders) {
            String itemName = order.item();
            double amount = order.total();

            result.put(
                itemName,
                result.getOrDefault(itemName, 0.0) + amount
            );
        }

        return result;
    }
}

public class Stuednt {
	public static void main(String[] args) {
		List<Order> orders = List.of(
	            new Order("Laptop", 2, 50000.0),
	            new Order("Mouse", 3, 500.0),
	            new Order("Laptop", 1, 50000.0),
	            new Order("Mouse", 2, 500.0),
	            new Order("Keyboard", 1, 1500.0)
	        );

	        OrderProcessor processor = new OrderProcessor();

	        Map<String, Double> summary = processor.summarize(orders);

	        System.out.println(summary);
	}

}
