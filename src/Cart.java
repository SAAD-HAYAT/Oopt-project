import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Cart extends MainMenu {
    ArrayList<String> items = new ArrayList<>();
    private int input;
    private int total;
    private int choice;
    private int flag;

//    public int getFlag() {
//        return flag;
//    }

//    public void setFlag(int flag) throws Exception{
//        if(flag == 0 && flag == 1){
//            this.flag = flag;
//        }
//        else{
//            throw new Exception("WRONG INPUT :/");
//        }
//    }

    private int j=0;

    public Cart(ArrayList<MainMenu> stL) throws Exception {
        userInput(stL,0);

    }


    public int getChoice() {
        return choice;
    }
    public void setChoice(int choice) throws Exception {

        if(getInput()==1 && choice >= 0 && choice <= 3 ) {
            this.choice = choice;
        }else if(getInput()==2 && choice >= 4 && choice <= 7 )  {
            this.choice = choice;
        }else if(getInput()==3 && choice >= 8 && choice <= 11 )  {
            this.choice = choice;
        }
        else{
            throw new Exception("Invalid Choice");
        }
    }


    public int getInput() {
        return input;
    }

    public void setInput(int input) throws Exception {
        if(input >= 1 && input <= 3){
            this.input = input;
        }
        else{
            throw new Exception("Must be between 1-3");
        }
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }



    public void display(ArrayList<MainMenu> stL) {
        if (getInput() == 1) {
            for (int i = 0; i <= 3; i++) {
                System.out.println(i + " " +stL.get(i).toString(i));
            }
        } else if (getInput() == 2) {
            for (int i = 4; i <= 7; i++) {
                System.out.println(i + " " +stL.get(i).toString(i));
            }
        } else if (getInput() == 3) {
            for (int i = 8; i <= 11; i++) {
                System.out.println(i + " " +stL.get(i).toString(i));
            }
        }
    }


    public void userInput(ArrayList<MainMenu> stL,int i) throws Exception{
        int flag = 0;
        j=0;
        do {
            System.out.println("\tSTARTERS\t|\t" + "BBQ\t\t|\t" + "FAST-FOOD\t|\t");
            System.out.println("PRESS 1 FOR STARTERS, 2 FOR BBQ, 3 FOR FAST-FOOD");
            System.out.println("SELECT YOUR PREFERENCE:");

            Scanner Sc = new Scanner(System.in);
            setInput(Sc.nextInt());
            display(stL);
            System.out.println("Enter Your Choice:");
            setChoice(Sc.nextInt());
            //do while

            this.items.add(stL.get(getInput()).toString(i));
            System.out.println(items.get(j));
            setTotal(getTotal() + stL.get(getInput()).getPrice());
            j++;
            System.out.println("Total: " + getTotal());
            System.out.println("Willing to add more item in your cart?\nPress 0 for that, 1 to EXIT!");
            Scanner Sc2 = new Scanner(System.in);
            flag = Sc2.nextInt();
            //do while
        }
        while (flag == 0);
        items.add("Total: " +getTotal());
        //code to create a new file.
        File cart = new File("cart.txt");
        try {
            cart.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        // code to write a new file.
        FileWriter fileWriter;

        {
            try {
                fileWriter = new FileWriter("cart.txt");
                for (i = 0; i < j; i++) {
                    fileWriter.write(i+" "+items.get(i)+"\n");
                }
                fileWriter.write(items.get(j));
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        items.clear();
    }
}

