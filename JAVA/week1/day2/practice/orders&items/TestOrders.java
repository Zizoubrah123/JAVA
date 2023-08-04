import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    ItemUtil item1 = new ItemUtil();
    item1.name = "mocha";
    item1.price = 4.8;


    ItemUtil item2 = new ItemUtil();
    item2.name = "latte";
    item2.price = 5.3;


    ItemUtil item3 = new ItemUtil();
    item3.name = "drip coffee";
    item3.price = 4.2;


    ItemUtil item4 = new ItemUtil();
    item4.name = "capuccino";
    item4.price = 8.6;


        // Order variables -- order1, order2 etc.
    
    OrderUtil order1 = new OrderUtil();
    // System.out.println(order1.total);
        order1.name = "cindhuri";

    OrderUtil order2 = new OrderUtil();
        order2.name = "Jimmy";

    OrderUtil order3 = new OrderUtil();
        order3.name = "Noah";

    OrderUtil order4 = new OrderUtil();
        order4.name = "Sam";


    order1.ready = true;
        // Application Simulations
    order2.items.add(item1);
    order2.total += item1.price;

    order3.items.add(item4);
    order3.total += item4.price;

    order4.items.add(item2);
    order4.total += item4.price;

    order4.items.add(item2);
    order4.items.add(item2);
    order4.total += item4.price *2;

    order2.ready = true;
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println("==========================");

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
    System.out.println("==========================");

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
    System.out.println("==========================");
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
 