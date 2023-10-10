package Builder;

public class Main {

    public static void main(String[] args) {
        MealBuilder m1 = new MealBuilder();
        Meal k1 = m1.chickBwithbottledCoke();
        Meal k2 = m1.vegBwithcannedPepsi();
        Meal k3 = m1.ChickenBwithcannedCoke();
        Meal k4 = m1.vegBwithbottledPepsi();
        k1.showMealItems();
        System.out.println("Total: " + k1.getTotalCost());
        System.out.println();
        k2.showMealItems();
        System.out.println("Total: " + k2.getTotalCost());
        System.out.println();
        k3.showMealItems();
        System.out.println("Total: " + k3.getTotalCost());
        System.out.println();
        k4.showMealItems();
        System.out.println("Total: " + k4.getTotalCost());

    }
}
