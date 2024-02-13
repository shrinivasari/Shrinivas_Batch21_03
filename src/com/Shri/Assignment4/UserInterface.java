package com.Shri.Assignment4;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class Products {
    private List<String> productList;

    public Products() {
        this.productList = new ArrayList<>();
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public void addProductToList(String product) {
        productList.add(product);
    }

    public void sortProductList() {
        Collections.sort(productList);
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        int choice = 0;

        while (true) {
            System.out.println("1.Add\n2.Display\n3.Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the product");
                    String product = scanner.nextLine();
                    products.addProductToList(product);
                    break;
                case 2:
                    if (products.getProductList().isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        products.sortProductList();
                        for (String item : products.getProductList()) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    return; // Terminate the program
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}