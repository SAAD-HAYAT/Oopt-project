import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Cart extends MainMenu {
    ArrayList<String> items = new ArrayList<>();
    private int input;
    private int total;
    private int j=0;

    public Cart(ArrayList<MainMenu> stL) {
        userInput(stL,0);

    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
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
                System.out.println(stL.get(i).toString(i));
            }
        } else if (getInput() == 2) {
            for (int i = 4; i <= 7; i++) {
                System.out.println(stL.get(i).toString(i));
            }
        } else if (getInput() == 3) {
            for (int i = 8; i <= 11; i++) {
                System.out.println(stL.get(i).toString(i));
            }
        }
    }


    public void userInput(ArrayList<MainMenu> stL,int i) {
        int flag = 0;
        j=0;
        do {
            System.out.println("1)Starters\n" + "2)BBQ\n" + "3)FastFood");
            System.out.println("Select a type");
            Scanner Sc = new Scanner(System.in);
            setInput(Sc.nextInt());
            display(stL);
            System.out.println("Enter your choice");
            setInput(Sc.nextInt());
            //do while

            this.items.add(stL.get(getInput()).toString(i));
            System.out.println( items.get(j));
            setTotal(getTotal() + stL.get(getInput()).getPrice());
            j++;
            System.out.println("Total :" + getTotal());
            System.out.println("Do you want to add more then press 0\n or want to exit press 1");
            Scanner Sc2 = new Scanner(System.in);
            flag = Sc2.nextInt();
            //do while
        }
        while (flag == 0);
        items.add("Total :" +getTotal());
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
//        for (i = 0; i <= j; i++) {
//            System.out.println(items.get(i));
//        }
    }
}

