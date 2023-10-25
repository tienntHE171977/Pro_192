package items;

public class Item {

    private String code;
    private String name;
    private int price;

    public Item(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("1-Add new item");
        System.out.println("2-Remove an item");
        System.out.println("3-Update an item's price");
        System.out.println("4-Print the list");
        System.out.println("5-Save to files");
        System.out.println("6-Quit");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

}
