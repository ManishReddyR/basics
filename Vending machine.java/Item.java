public class Item {
    private String name;
    private double price;
    private int quantity;


    public Item(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public Item(Item source){
        this.name=source.name;
        this.price=source.price;
        this.quantity=source.quantity;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", quantity='" + getQuantity() + "'" +
            "}";
    }    
}
