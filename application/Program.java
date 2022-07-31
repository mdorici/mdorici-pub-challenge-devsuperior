package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();
        System.out.print("Gender: ");
        bill.gender = sc.next().charAt(0);
        System.out.print("Quantity of beers: ");
        bill.beer =  sc.nextInt();
        System.out.print("Quantity of soft drinks: ");
        bill.softDrink =  sc.nextInt();
        System.out.print("Quantity of barbecue: ");
        bill.barbecue =  sc.nextInt();

        System.out.println();
        System.out.println("RECORD: ");
        System.out.printf("Feeding = R$ %.2f%n", bill.feeding());
        if(bill.cover() == 0.00) {
            System.out.println("Covert free");
        }
        else {
            System.out.printf("Covert = R$ %.2f%n", bill.cover());
        }
        System.out.printf("Ticket = R$ %.2f%n", bill.ticket());

        System.out.println();
        System.out.printf("Total = R$ %.2f%n", bill.total());

        sc.close();
    }
}
