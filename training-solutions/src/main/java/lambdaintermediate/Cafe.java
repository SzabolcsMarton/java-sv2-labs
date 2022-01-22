package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {

    private List<CoffeeOrder> orders;

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public Integer getTotalIncome() {
        return orders
                .stream()
                .flatMap(l -> l.getCoffeeList().stream())
                .map(Coffee::getPrice)
                .reduce(0, Integer::sum);
    }

    public Integer getTotalIncome(LocalDate date) {
        return orders
                .stream()
                .filter(coffeeOrder -> coffeeOrder.getDateTime().toLocalDate().equals(date))
                .flatMap(l -> l.getCoffeeList().stream())
                .map(Coffee::getPrice)
                .reduce(0, Integer::sum);
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return orders
                .stream()
                .flatMap(l -> l.getCoffeeList().stream())
                .filter(coffee -> coffee.getType().equals(type))
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from) {
        return orders
                .stream()
                .filter(coffeeOrder -> coffeeOrder.getDateTime().isAfter(from))
                .toList();
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return orders
                .stream()
                .filter(coffeeOrder -> coffeeOrder.getDateTime().toLocalDate().equals(date))
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .toList();
    }

    public void addNewOrder(CoffeeOrder newOrder) {
        orders.add(newOrder);
    }

    public List<CoffeeOrder> getOrders() {
        return new ArrayList<>(orders);
    }
}
