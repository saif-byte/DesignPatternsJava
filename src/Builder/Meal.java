package Builder;

import java.util.ArrayList;

public class Meal {

    ArrayList<Item> Items = new ArrayList<Item>();

    public void addItems(Item i){
        Items.add(i);
    }

    public float getTotalCost(){
        float cost = 0;
        for (int i = 0 ; i < Items.size() ; i++){
            cost+= Items.get(i).price();
        }
        return cost;
    }

    public void showMealItems(){
        for (int i = 0; i < Items.size() ; i++) {
            System.out.println("Item " + i + " : " + Items.get(i).name() + "\t" + Items.get(i).price() );
        }
    }




}
