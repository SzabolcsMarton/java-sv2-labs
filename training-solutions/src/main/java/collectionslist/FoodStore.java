package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {

    private List<Food> foods;

    public FoodStore() {
        this.foods = new LinkedList<>();
    }

    public void addFood(Food food){
       foods.add(food);
    }

    public void sellFirst(Food food){
        if(food.getExpirationDate().equals(LocalDate.now())){
            foods.add(0,food);
        }
    }

    public List<Food> getFoods() {
        return new LinkedList<>(foods);
    }
}
