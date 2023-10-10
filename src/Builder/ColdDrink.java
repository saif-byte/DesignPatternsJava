package Builder;


public abstract class ColdDrink implements Item {

    String type ;
    public Packing packedin ;

    public ColdDrink(String type){
        this.type = type;
    }
    public Packing packing(){
        if (type.toLowerCase() == "can") {
            packedin = new Can();

        }
        else{
        packedin = new Bottle();

    }
    return packedin;
    }

    @Override
    public abstract String name();
    public abstract float price();

}
