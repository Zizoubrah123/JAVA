import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    


        // Menu items

        ItemUtil item1 = new ItemUtil("drip coffee", 1.60);
        ItemUtil item2 = new ItemUtil("capuccino", 2.45);
        ItemUtil item3 = new ItemUtil("iced coffee", 2.15);
        ItemUtil item4 = new ItemUtil("mocha", 3.10);


    OrderUtil order1 = new OrderUtil();
    OrderUtil order2 = new OrderUtil();

    OrderUtil order3 = new OrderUtil("aziz");
    OrderUtil order4 = new OrderUtil("adem");
    OrderUtil order5 = new OrderUtil("maram");

    order1.addItem(item4);
    order1.addItem(item4);

    order2.addItem(item3);
    order2.addItem(item3);

    order3.addItem(item2);
    order3.addItem(item2);

    order4.addItem(item1);
    order4.addItem(item1);
    order4.addItem(item1);

    order5.addItem(item2);
    order5.addItem(item4);
    order5.addItem(item1);

    order5.setReady(true);

    order1.display();
    order2.display();
    order3.display();
    order4.display();
    order5.display();
    }
}
 