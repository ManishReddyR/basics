import java.util.ArrayList;

public class Machine {
    private ArrayList<Item> items;

    public Machine() {
        this.items = new ArrayList<Item>();
    }
    
    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }
    
    public void setItem(int index,Item item) {
        this.items.set(index, new Item(item));
    }
    
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }

    

   
}