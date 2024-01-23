
import java.util.Objects;
import java.util.Scanner;
public class TrainReservationSystem {
    public static  boolean[] seats = new boolean[50];
    public static String username;
    public static String password;
    public static void Registration(){
        Scanner sc = new Scanner(System.in);
        System.out.println("......REGISTRATION FORM......");
        System.out.println("Enter Username you want");
        username = sc.nextLine();
        System.out.println("Enter password you want");
        password = sc.nextLine();
        System.out.println("You are successfully registered");
    }

    public static void Login(){
        System.out.println("......LOGIN PAGE......");
        System.out.println("Enter username");
        Scanner sc = new Scanner(System.in);
        String inputUsername = sc.nextLine();
        System.out.println("Enter password");
        String inputPassword = sc.nextLine();
        if(inputUsername.equals(username) && password.equals(inputPassword)) {
            System.out.println("Successfully Login!!!!!!!!!!!!!!!!!!");
            while (true) {
                Process();
            }   }
        else{
            System.out.println("WRONG INPUT TRY AGAIN");
            Login();
        }
    }

    public static void Process() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Press [1] For Reserve Seat");
        System.out.println("Press [2] For Cancellation Seat");
        System.out.println("Press [3] For  View Available Seat");
        System.out.println("Press [4] For Exit Program");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                reserveSeat();
                break;
            case 2:
                CancelSeat();
                break;
            case 3:
                ViewSeats();
                break;
            case 4:
                System.exit(1);
            default:
                System.out.println("Invalid Input");
                Process();
        }
    }

    public static void reserveSeat(){
        System.out.println("Enter Seat Number to Reserve");
        Scanner sc = new Scanner(System.in);
        int seatNumber = sc.nextInt();
        if(seatNumber >= 1 && seatNumber <=seats.length){
            if(!seats[seatNumber-1]){
                seats[seatNumber-1] = true;
                System.out.println("Your Seat Number "+seatNumber+" Is Successfully Reserved");
            }
            else{
                System.out.println("Seat Number "+seatNumber+" Is Already Reserved!! please Choose Another Seat");
                reserveSeat();
            }
        }
        else{
            System.out.println("Invalid Seat Number!! Please Type Valid Number");
        }
    }

    public static void CancelSeat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Seat Number to Cancel Your Seat");
        int cancelSeat = sc.nextInt();
        if(cancelSeat >=1 && cancelSeat <=seats.length) {
            if (seats[cancelSeat - 1]) {
                System.out.println("Seat Number " + cancelSeat + " cancellation Successfully Done!!");
            } else {
                System.out.println(("Seat Number " + cancelSeat + " Is Not Reserved Before!! Choose The valid Seat Number"));
            }
        }
        else{
            System.out.println("Invalid Seat Number!! Please Type Valid Number");
        }
    }

    public static void ViewSeats() {
        System.out.println("Available Seats are: ");
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]){
                System.out.print((i+1) + " ");
            }
        }
        System.out.println();
    }

    public static void ExitProgram(){
        System.out.println("Exit Program");
        System.exit(0);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 For Registration");
        int choice = sc.nextInt();
        if (choice == 1) {
            Registration();
            Login();
        } else {
            System.out.println("Invalid Input");
        }
    }





}



