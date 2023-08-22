import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> num = new ArrayList<Integer>();
        Random randomNum = new Random();
            for (int i = 0; i < 10; i++) {
            num[i] = randomNum.nextInt();
            System.out.println(num[i]);
        }
    return num;
    }

}