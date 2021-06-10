import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
public class CheckOut {
   private String ans;
    public CheckOut(ArrayList<MainMenu> stL,Cart cart){
        Decision(stL,cart);
    }
    public void Decision(ArrayList<MainMenu> stL, Cart cart){
        //code to read a file.
        File carT = new File("cart.txt");
        try {
            Scanner sc = new Scanner(carT);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("press 'y' to confirm your order or press 'n' to reorder");
        Scanner Sc = new Scanner(System.in);
        //do while
        ans = Sc.next();

        if(ans.equalsIgnoreCase("y")){
            System.out.println("Your order is confirmed");
        }
        else if (ans.equalsIgnoreCase("n")) {
            File myFile = new File("cart.txt");
            cart.userInput(stL,0);
        }
        }
    }

