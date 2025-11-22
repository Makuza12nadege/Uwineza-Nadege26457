package onlineShoppingSystem.Q10;

import java.util.Scanner;

public class MainQ10 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("===== ONLINE SHOPPING SYSTEM INPUT =====");

            // Store
            System.out.print("Enter Store Name: ");
            String storeName = sc.nextLine();

            System.out.print("Enter Store Address: ");
            String storeAddress = sc.nextLine();

            System.out.print("Enter Store Email: ");
            String storeEmail = sc.nextLine();

            Store store = new Store(1, "2025-01-01", "2025-01-01",
                    storeName, storeAddress, storeEmail);

            // Category
            System.out.print("Enter Category Name: ");
            String categoryName = sc.nextLine();

            System.out.print("Enter Category Code (>=3 chars): ");
            String categoryCode = sc.nextLine();

            Category category = new Category(2, "2025-01-01", "2025-01-01",
                    categoryName, categoryCode);

            // Product
            System.out.print("Enter Product Name: ");
            String productName = sc.nextLine();

            System.out.print("Enter Product Code: ");
            String productCode = sc.nextLine();

            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // clear buffer

            Product product = new Product(3, "2025-01-01", "2025-01-01",
                    productName, productCode, price);

            // Customer
            System.out.print("Enter Customer Name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter Contact Number: ");
            String contact = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            Customer customer = new Customer(4, "2025-01-01", "2025-01-01",
                    customerName, contact, address);

            // Order
            System.out.print("Enter Order Date: ");
            String orderDate = sc.nextLine();

            System.out.print("Enter Order ID: ");
            String orderId = sc.nextLine();

            Order order = new Order(5, "2025-01-01", "2025-01-01",
                    orderDate, orderId);

            // Shipping
            System.out.print("Enter Shipping Address: ");
            String shippingAddress = sc.nextLine();

            System.out.print("Enter Shipping Cost: ");
            double shippingCost = sc.nextDouble();

            Shipping shipping = new Shipping(6, "2025-01-01", "2025-01-01",
                    shippingAddress, shippingCost);

            // Calculate total
            OrderRecord record = new OrderRecord(product, shipping);
            double totalAmount = record.calculateTotalAmount();

            Invoice invoice = new Invoice(7, "2025-01-01", "2025-01-01",
                    totalAmount);

            // OUTPUT
            System.out.println("\n===== FINAL OUTPUT =====");
            System.out.println("Product: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Shipping: $" + shippingCost);
            System.out.println("------------------------");
            System.out.println("TOTAL AMOUNT: $" + totalAmount);
            System.out.println("========================");
        }
    }


