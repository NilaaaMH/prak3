package Tugas;

public class ConcertTicketSystem {

    public static final int Default_Price = 50; //mengubah jadi cons defaul price
    private int[][] seatPrices;
    public boolean[][] seatAvailability; //ganti private jadi public
    private int totalRows;
    private int totalCols;

    //membuat method get
    private int seatsAvailable; //seatsAvailable>EncField>Get>muncul di 106 112


    public ConcertTicketSystem(int rows, int cols) {
        this.totalRows = totalRows;
        this.totalCols = totalCols;
        this.seatsAvailable = rows * cols;
        initializeSeatPricesAndAvailability();
    }

    private void initializeSeatPricesAndAvailability() {
        seatPrices = new int[totalRows][totalCols];
        seatAvailability = new boolean[totalRows][totalCols];

        for(int i = 0; i < totalRows; i++) {
            for(int j = 0; j < totalCols; j++) {

                //membuat const default price
                seatPrices[i][j] = Default_Price;          //50>IntroCons>Default_Price
                seatAvailability[i][j] = true;
            }
        }
    }

    public void showSeatPrices() {
        System.out.println("Seat Prices : ");
        for(int i = 0; i < totalRows; i++) {
            for(int j = 0; j < totalCols; j++) {
                System.out.println("Row " + (i + 1) + ", Column " + (j + 1) + " : $" + seatPrices[i][j]);
            }
        }
    }

    public void showAvailableSeats() {
        System.out.println("Available Seats : ");
        for(int i = 0; i < totalRows; i++) {
            for(int j = 0; j < totalCols; j++) {
                if(seatAvailability[i][j]) {
                    System.out.print("[ " + (i + 1) + "," + (j + 1) + " ] ");
                } else {
                    System.out.print("[ X ] ");
                }
            }
            System.out.println();
        }
    }

    public void buyTicket(int row, int col) {
        boolean validSeat = IsValidSeat(row, col);

        //membuat inline variable
        if(IsValidSeat(row, col)) { //ifvalidseat>inlinevar
            int price = seatPrices[row - 1][col - 1];
            System.out.println("You have purchased a ticket at row " + row + " and column " + col + " for $" + price);
            seatAvailability[row - 1][col - 1] = false;
            seatsAvailable = getSeatsAvailable() - 1;
        } else {
            System.out.println("Invalid seat selection or seat is alredy taken.");
        }
    }

    //hasil dari inline variable menjadi private boolean
    private boolean IsValidSeat(int row, int col) {
        return row >= 1 && row <= totalRows && col >= 1 && col <= totalCols && seatAvailability[row - 1][col - 1];
    }


    //hasil dari method get
    public int getSeatsAvailable() {
        return seatsAvailable;
    }
}

/*
1. Ganti 50 ke introduce constant = Default_Price.
2. Ganti int seatAvaibel paling atas ke encalupse field Getter (membuat method get).
3. Refactor if (valid set) ke inline variabel.
4. Habis ke 3 langsung refaktor method nama = isValidSeat.
5. buat java.class main baru.
6. move psvm to main
7. Di main class baru membuat getSeatsAvailable());
*/