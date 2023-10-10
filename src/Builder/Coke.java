package Builder;

public class Coke extends ColdDrink {


    public Coke(String type) {
        super(type);
    }

    public String name(){
        return "Coke";
    }

    public float price(){
        if (this.type == "can"){
            return 100;
        }
        else{
            return 60;
        }
    }
}
