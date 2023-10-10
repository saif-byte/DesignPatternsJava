package Builder;

public abstract class Fries implements Item {
    public Packing packing(){
        return new Box();
    }

    public abstract String name();
    public abstract  float price();

}
