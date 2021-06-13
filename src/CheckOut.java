import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
public class CheckOut {
    File cart = new File("cart.txt");
   private String ans;
    public CheckOut(ArrayList<MainMenu> stL,Cart cart){
        Decision(stL,cart);
    }
    public void finalDisplay(){
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
    }
    public void Decision(ArrayList<MainMenu> stL, Cart cart1){
        finalDisplay();
        System.out.println("press 'y' to confirm your order or press 'n' to reorder");
        Scanner Sc = new Scanner(System.in);
        //do while
        ans = Sc.next();

        if(ans.equalsIgnoreCase("y")){
            System.out.println("Your order is confirmed");
            cart.delete();
        }
        else if (ans.equalsIgnoreCase("n")) {
            cart.delete();
            if(cart1.getTotal()>0)
                cart1.setTotal(0);
            cart1.userInput(stL,0);
            finalDisplay();
            System.out.println("Your order is confirmed");
            cart.delete();
        }
        }
    }

