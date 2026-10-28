package srs;
public class product {
    private  int id;
    private  String name;
    private  double price;
    private  int quantity;

    public product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public  int getid(){
        return id;
    }

    public  String getname(){
        return name;
    }

    public  double getprice(){
        return price;
    }

    public  int getquantity(){
        return quantity;
    }

    public  void displayproduct() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
