package Javanote;

import java.util.Scanner;

public class Switch {

    static int productId;
    static String productName;
    static double cost;
    static float profit;
    static double price;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            menu();
            System.out.println("¿Desea continuar? (si/no)");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("no")) {
                running = false;
            }
        }
    }

    public static void createProduct() {
        System.out.println("Id:");
        productId = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        System.out.println("Nombre del producto:");
        productName = sc.nextLine();
        System.out.println("Costo:");
        cost = sc.nextDouble();
        System.out.println("Beneficio (%):");
        profit = sc.nextFloat();
        sc.nextLine(); // Consume newline left-over
        price = calculatePrice(profit, cost);
    }

    public static double calculatePrice(float profit, double cost) {
        return cost / (1 - (profit / 100));
    }

    public static void printProduct() {
        System.out.println("ID: " + productId);
        System.out.println("Nombre del producto: " + productName);
        System.out.println("Costo: " + cost);
        System.out.println("Beneficio: " + profit + "%");
        System.out.println("Precio de venta: " + price);
    }

    public static void menu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Crear Producto");
        System.out.println("2. Ver Producto");

        int opc = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        switch (opc) {
            case 1:
                System.out.println("Crear Producto:");
                createProduct();
                break;
            case 2:
                System.out.println("Ver Producto:");
                printProduct();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}









