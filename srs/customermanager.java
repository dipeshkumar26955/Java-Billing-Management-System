package srs;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class customermanager {
    private ArrayList<customer> customers = new ArrayList<>();

    public void addCustomer(customer customer1) {
        customers.add(customer1);
        System.out.println("Customer added successfully!");
    }

    public void displayAllCustomers() {

        if (customers.isEmpty()) {
            System.out.println("No customer available.");
            return;
        }

        for (customer ele : customers) {
            ele.displaycustomer();
            System.out.println("------------------");
        }
    }

    public void savacustomertofile(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("customer.txt"));
            for(customer c: customers){
                bw.write(c.getId() + ","+c.getName()+","+c.getPhone());
                bw.newLine();
            }
            bw.close();
            System.out.println("Customers saved successfully!");
        }catch(IOException e){
            System.out.println("Error saving customers: " + e.getMessage());
        }
    }
    
}
