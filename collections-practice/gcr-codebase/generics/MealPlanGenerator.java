package generics;

import java.util.ArrayList;
import java.util.List;

// Base interface for all meal plans
interface MealPlan {
    String getMealType();
    int getCalories();
}

// Vegetarian meal plan
class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }

    public int getCalories() {
        return 1800;
    }
}

// Vegan meal plan
class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }

    public int getCalories() {
        return 1600;
    }
}

// Keto meal plan
class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }

    public int getCalories() {
        return 2000;
    }
}

// High protein meal plan
class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High Protein";
    }

    public int getCalories() {
        return 2200;
    }
}

// Generic Meal class restricted to MealPlan
class Meal<T extends MealPlan> {

    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public String getMealDetails() {
        return "Meal Type: " + mealPlan.getMealType() +
                ", Calories: " + mealPlan.getCalories();
    }
}

// Utility class for meal operations
class MealUtils {

    // Generic method to validate and generate meal plan
    public static <T extends MealPlan> Meal<T> generateMeal(T mealPlan) {
        if (mealPlan.getCalories() <= 0) {
            throw new IllegalArgumentException("Invalid calorie count");
        }
        return new Meal<>(mealPlan);
    }
}

// Main class
public class MealPlanGenerator{

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealUtils.generateMeal(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                MealUtils.generateMeal(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                MealUtils.generateMeal(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                MealUtils.generateMeal(new HighProteinMeal());

        List<Meal<?>> meals = new ArrayList<>();
        meals.add(vegMeal);
        meals.add(veganMeal);
        meals.add(ketoMeal);
        meals.add(proteinMeal);

        for (Meal<?> meal : meals) {
            System.out.println(meal.getMealDetails());
        }
    }
}

