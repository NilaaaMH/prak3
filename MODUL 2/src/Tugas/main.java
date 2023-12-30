package Tugas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {    //public-args move member
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the concert hall : ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of cols in the concert hall : ");
        int cols = scanner.nextInt();

        ConcertTicketSystem ticketSystem = new ConcertTicketSystem(rows, cols);

        System.out.println("Welcome to the Concert Ticket System!");
        ticketSystem.showSeatPrices();

        char choice;
        do {
            System.out.println("\n Options : ");
            System.out.println("1. View Available Seats");
            System.out.println("2. Buy Ticket");
            System.out.println("3. View Available Seats Count");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4) : ");
            choice = scanner.next().charAt(0);

            switch(choice) {
                case '1':
                    ticketSystem.showAvailableSeats();
                    break;
                case '2':
                    System.out.print("Enter row number : ");
                    int row = scanner.nextInt();
                    System.out.print("Enter column number : ");
                    int col = scanner.nextInt();
                    ticketSystem.buyTicket(row , col);
                    break;
                case '3':
                    System.out.println("Available seats Count : " + ticketSystem.getSeatsAvailable());
                    break;
                case '4':
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
