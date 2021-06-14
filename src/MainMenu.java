

abstract public class MainMenu {
    private int id;
    private static int count;
    private String name;
    private int price;

//    public MainMenu() {
//        count++;
//        setId(count);
//
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(int i) {
        return  getName() + " " + getPrice();
    }
}