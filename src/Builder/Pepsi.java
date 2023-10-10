package Builder;

public class Pepsi extends ColdDrink {

    public Pepsi(String type) {
        super(type);
    }

    public String name(){
        return "Pepsi";
    }

    public float price(){
        if (this.type=="can"){
            return 90;
        }
        else{
            return 50;
        }
    }
}
