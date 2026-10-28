package srs;
import java.util.*;
public class main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        productmanager manager = new productmanager();

        customermanager manager1 = new customermanager();

        int choice;

        do{

            System.out.println("\\n===== BILLING MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Save Products");
            System.out.println("4. Add Customer");
            System.out.println("5. Display All Customers");
            System.out.println("6. Save Customers");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice=sc.nextInt();

            switch(choice){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Product ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Product Quantity: ");
                    int quantity = sc.nextInt();

                    product product1 = new product(id,name,price,quantity);

                    manager.addproduct(product1);

                    break;
                
                case 2:
                    manager.displayallproduct();
                    break;
                
                case 3:
                    manager.saveproducttofile();
                    System.out.println("Products saved!");
                    break;

                case 4:
                    System.out.print("Enter Customer ID: ");
                    int customerId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String customerName = sc.nextLine();

                    System.out.print("Enter Customer Phone: ");
                    String phone = sc.nextLine();

                    customer customer1 = new customer(
                    customerId, customerName, phone );

                    manager1.addCustomer(customer1);
                    break; 
                    
                case 5:
                    manager1.displayAllCustomers();
                    break; 

                case 6:
                    manager1.savacustomertofile();
                    System.out.println("CUstomer saved!");
                    break;
                case 7:
                    System.out.println("Exiting Billing Management System...");
                    break;
                 
                default:
                    System.out.println("Invalid choice! Try again.");
            
            }
        }while(choice != 7);

        sc.close();
    }
}