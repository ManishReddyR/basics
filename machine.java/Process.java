import java.util.ArrayList;
import java.util.Scanner;

public class Process {
    ArrayList<Item>  items;

    public Process(){
        this.items=new ArrayList<Item>();
    }


    public Item getItems(int index) {
        return new Item(this.items.get(index));
    }

    public void setItems(int index,Item item) {
        this.items .set(index, new Item(item));
    }

    
    public void addItem(Item item) {
        Scanner scan=new Scanner(System.in);
        if (this.items.contains(item)) {
            System.out.println("Enter the quantity by which you want to increment : ");
            int iquan=scan.nextInt();
            item.setQuantity(item.getQuantity()+iquan);
        }
        this.items.add(new Item(item)); 
        scan.close();
    }

    public boolean add(Item item) {
        if (this.items.contains(item)) {
            return false;
        }
        this.items.add(new Item(item));
        return true;
    } 


    public void remove(String name) {
        if (items.isEmpty()) {
            throw new IllegalStateException("cannot remove from an empty cart");
        }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(name)) {
                this.items.remove(i);
            }
        }
    }

    public String checkout() {
        if (items.isEmpty()) {
            throw new IllegalStateException("cannot checkout an empty cart");
        }
        double measures=0;
        for (int i = 0; i < this.items.size(); i++) {
            measures += this.items.get(i).getPrice();
        }
        return "\tRECEIPT\n\n" +
                   "\tTotal: $" + measures + "\n";
        
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