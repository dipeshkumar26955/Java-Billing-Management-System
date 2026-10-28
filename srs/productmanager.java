package srs;
import java.util.ArrayList;
import java.io.*;

public class productmanager{
    private ArrayList<product> products = new ArrayList<>();
    public void addproduct(product product1){
        products.add(product1);
        System.out.println("product added sussessfully!");
    }

    //display all product
    public void displayallproduct(){
        if(products.isEmpty()){
            System.out.println("no product available.");
            return;
        }
        for(product ele: products){
            ele.displayproduct();
            System.out.println("------------------");
        }
    }

    public void saveproducttofile(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("product.txt"))){
               for(product ele: products){
                    writer.write(
                        ele.getid()+","+
                        ele.getname() + "," +
                        ele.getprice() + "," +
                        ele.getquantity()
                    );
                    writer.newLine();
               }
               System.out.println("Products saved successfully!");

        }
        catch(IOException e){
            System.out.println("Error saving products: " + e.getMessage());
        }
    }

    public void loadproductfromfile(){
        products.clear();

        try(BufferedReader reader = new BufferedReader(new FileReader("product.txt"))){
            String line;
            while((line=reader.readLine()) != null){
                String[] data = line.split(",",-1);
                if(data.length !=4){
                    System.out.println("invalid product record skipped.");
                    continue;
                }
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double price = Double.parseDouble(data[2]);
                int quantity = Integer.parseInt(data[3]);

                product product1 = new product(id,name,price,quantity);
                products.add(product1);
            }
            System.out.println("Products loaded successfully!");
        }
        catch(IOException e){
            System.out.println("File error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number in product file.");
        }
    }
}