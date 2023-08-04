import java.util.ArrayList;

public class OrderUtil {

    private String name;
    // public double total;
    private boolean ready;
    private ArrayList<ItemUtil> items;

// ==================constructiors==================

    public OrderUtil() {
        // setting the color attribute to the value from the color parameter
        this.name = "guest";
        this.items = new ArrayList<ItemUtil>();
    }

    public OrderUtil(String name) {
        this.name = name;
        this.items = new ArrayList<ItemUtil>();
    }
    

//=======================methods======================

    public void addItem(ItemUtil ItemUtil ){
        items.add(ItemUtil);
    }


    public String getStatusMessage(){
        if (ready){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double total = 0;
        for(ItemUtil ItemUtil : items){
            total += ItemUtil.getPrice();
        }
        return total;
    }

    public void display(){

        System.out.println("Customer Name:"+this.name);

        for(ItemUtil ItemUtil : items){
            System.out.println(ItemUtil.getName() +" - $"+ ItemUtil.getPrice());
        }
        System.out.println("Total: $"+getOrderTotal());
        System.out.println("================================");
    }
    // ================getters and  setter==============

    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    // getter

    public boolean getReady(){
        return ready;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public ArrayList<ItemUtil> getItems(){
        return items;
    }
    public void setItems(ArrayList<ItemUtil> items){
        this.items = items;
    }
    // public OrderUtil(String color, int num) {
    //     this.color = color;
    //     this.numberOfWheels = num;
    // }



}