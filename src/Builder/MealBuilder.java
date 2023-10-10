package Builder;

public class MealBuilder {
    public Meal vegBwithcannedPepsi(){
        Meal m = new Meal();
        m.addItems(new VegBurger());
        m.addItems(new Pepsi("can"));
        m.addItems(new MasalaFries());
        return m;
    }

    public Meal chickBwithbottledCoke(){
        Meal m = new Meal();
        m.addItems(new ChickenBurger());
        m.addItems(new Coke("bottle"));
        m.addItems(new MayoFries());
        return m;
    }


    public Meal vegBwithbottledPepsi(){
        Meal m = new Meal();
        m.addItems(new VegBurger());
        m.addItems(new Pepsi("bottle"));
        m.addItems(new MasalaFries());
        return m;
    }

    public Meal ChickenBwithcannedCoke(){
        Meal m = new Meal();
        m.addItems(new ChickenBurger());
        m.addItems(new Coke("can"));
        m.addItems(new MayoFries());
        return m;
    }
}
