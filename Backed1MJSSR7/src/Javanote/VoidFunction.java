package Javanote;

import java.util.Scanner;

public class VoidFunction {

    static int costumerId;
    static String costumerName;

    static String email;

    static String password;

    static String status;



    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {

        createCostumer();




    }

    public static void createCostumer(){

        System.out.println("Ingresa el id: ");
        costumerId = sc.nextInt();
        sc.nextLine();
        System.out.println("Name: ");
        costumerName = sc.nextLine();
        System.out.println("email");
        email = sc.nextLine();
        System.out.println("Ingresa el correo: ");
        password = sc.nextLine();
        System.out.println("Seleccione un estado: ");
        int select = sc.nextInt();


    }
    public static void printCostumerData(){

        System.out.println("id "+ costumerId + "\n"+
                "Nombre" + costumerName + "\n" +
                "Correo"+ email+"\n" );


    }




    }
