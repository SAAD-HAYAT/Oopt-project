

abstract public class MainMenu {
    private int id=0;
    private String name;
    private int price;



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

    public String toString(int i){
        setId(i);
        return  getId()+" " + getName() + " " +getPrice() ;
    }
}