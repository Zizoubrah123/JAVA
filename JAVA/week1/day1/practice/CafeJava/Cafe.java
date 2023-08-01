package week1.day1.practice.CafeJava;
public class Cafe {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 5.5;
        double cappuccino = 6.7;
        double latte = 2.1;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "sam";
        String customer3 = "jimmy";
        String customer4 = "noah";
        
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;



        if (isReadyOrder1){
            System.out.println(generalGreeting + customer1); 
            System.out.println(readyMessage);
            System.out.println(displayTotalMessage + mochaPrice );
        }else{
            System.out.println(generalGreeting + customer1); 
            System.out.println(pendingMessage);

}

        if (isReadyOrder2){
            System.out.print("============================");
            System.out.println(generalGreeting + customer2); 
            System.out.println(readyMessage);
            System.out.println(displayTotalMessage + latte *2 );
        }else{
            System.out.println(generalGreeting + customer2); 
            System.out.println(pendingMessage);
}

        if (isReadyOrder3){
            System.out.print("============================");

            System.out.println(generalGreeting + customer3); 
            System.out.println(readyMessage);
            System.out.println(displayTotalMessage + (dripCoffee + latte) );
        }else{
            System.out.println(generalGreeting + customer3); 
            System.out.println(pendingMessage);
}

        if (isReadyOrder4){
            System.out.print("============================");
            System.out.println(generalGreeting + customer4); 
            System.out.println(readyMessage);
            System.out.println(displayTotalMessage + cappuccino );
        }else{
            System.out.println(generalGreeting + customer4); 
            System.out.println(pendingMessage);

        }
    }

}

