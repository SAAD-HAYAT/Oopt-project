import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
public class CheckOut {
    File cart = new File("cart.txt");
    private String ans;
    public CheckOut(ArrayList<MainMenu> stL,Cart cart) throws Exception {
        Decision(stL,cart);
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
            this.ans = ans;

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
    public void Decision(ArrayList<MainMenu> stL, Cart cart1) throws Exception {
        finalDisplay();
            System.out.println("Type 'yes' to confirm your order or type 'no' to reorder:");
            Scanner Sc = new Scanner(System.in);
            setAns(Sc.next());


        if(ans.equalsIgnoreCase("yes")){
            System.out.println("Your order is confirmed!");
            cart.delete();
        }
        else if (ans.equalsIgnoreCase("no")) {
            cart.delete();
            if(cart1.getTotal()>0)
                cart1.setTotal(0);
            cart1.userInput(stL,0);
            finalDisplay();
            System.out.println("Your order is confirmed!");
            cart.delete();
        }
    }
}

