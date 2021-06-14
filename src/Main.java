import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("*****\tFOOD ORDERING SYSTEM\t*****");
        try {
            ArrayList<MainMenu> stL = new ArrayList<MainMenu>();
            MainMenu st = new Starters("Garlic Bread", 200);
            stL.add(st);
            MainMenu st2 = new Starters("Crackers", 150);
            stL.add(st2);
            MainMenu st3 = new Starters("Cheese Balls", 300);
            stL.add(st3);
            MainMenu st4 = new Starters("Peri Bytes", 350);
            stL.add(st4);
            MainMenu bb = new Bbq("Tikka Boti", 200);
            stL.add(bb);
            MainMenu bb2 = new Bbq("Malai Boti", 450);
            stL.add(bb2);
            MainMenu bb3 = new Bbq("Seekh Kabab", 700);
            stL.add(bb3);
            MainMenu bb4 = new Bbq("Behaari Boti", 650);
            stL.add(bb4);
            MainMenu ff = new FastFoods("Chicken Roll", 400);
            stL.add(ff);
            MainMenu ff2 = new FastFoods("Grilled Burger", 450);
            stL.add(ff2);
            MainMenu ff3 = new FastFoods("Cheese Pizza", 550);
            stL.add(ff3);
            MainMenu ff4 = new FastFoods("Alfredo Pasta", 600);
            stL.add(ff4);
            Cart cart = new Cart(stL);
            CheckOut check = new CheckOut(stL, cart);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }
}
