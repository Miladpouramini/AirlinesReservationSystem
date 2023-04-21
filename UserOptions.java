import java.util.Scanner;

public class UserOptions {
    static Scanner scanner = new Scanner(System.in);
    public static void printUserMeno(){
        System.out.println("::::::::::::::::::::::::::::::::::::::::\n" +
                "         PASSENGER MENU OPTIONS\n" +
                "::::::::::::::::::::::::::::::::::::::::\n" +
                " ......................................\n" +
                "    <1> Change password\n" +
                "    <2> Search flight tickets\n" +
                "    <3> Booking ticket\n" +
                "    <4> Ticket cancelation\n" +
                "    <5> Booked tickets\n" +
                "    <6> Add charge\n" +
                "    <0> Sign out\n"+
                "-->");
    }
    public static void UserMeno(){
        int number;
        while (true) {
            printUserMeno();
            number = scanner.nextInt();
            switch (number) {
                case 1: {
                    changePassword();
                    break;
                }
                case 2:
                    //
                case 3:
                    //
                case 4:
                    //
                case 5:
                    //
                case 6:
                    //
                case 0:
                    FirstMeno.gettingFirstNumber();
            }
            continue;
        }
    }
    public static void changePassword(){
        while(true) {
            System.out.print("New password-->");
            String newPassword = scanner.next();
            System.out.print("Confirm new password-->");
            String cNewPassword = scanner.next();
            if (newPassword.equals(cNewPassword)){
                FirstMeno.password[FirstMeno.userNumber] = newPassword;
                System.out.println("The password was changed!");
            }
            else {
                System.out.println("Try again...!");
                continue;
            }
            break;
        }
    }
}
