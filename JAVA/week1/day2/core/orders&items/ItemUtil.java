public class ItemUtil {
    private String name;
    private double price;

    public ItemUtil(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    
    // setter
    public void setName(String name) {
        this.name = name;
    }
    // getter
    public double getPrice() {
        return price;
    }
    // setter
    public void setPrice(double price) {
        this.price = price;
    }
}