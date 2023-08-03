
import java.util.ArrayList;
public class CafeUtil {
    

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 0; i <= numWeeks ; i++){
            sum += i;
        }
        
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        double temp = 0;
        for (int i = 0; i < lineItems.length; i++){
            temp += lineItems[i];
        }
        return temp;
    }

    public void displayMenu(ArrayList<String> menu){
        
        for (int i = 0; i < menu.size() ;i++){
        System.out.printf("%d %s \n" , i, menu.get(i) );
        }
    }
    
    public String addCustomer(ArrayList<String> customers){
        System.out.println("Please enteer your name:");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.printf("hello %s \n", userName);
        System.out.printf("there are %d in front of you", customers.size() );
        return userName;
    }
    
}
