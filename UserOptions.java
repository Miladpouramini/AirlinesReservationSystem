import java.util.Scanner;

public class User {
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
                "    <0> Sign out");
    }
    public static void UserMeno(){
        int number;
        number = scanner.nextInt();
        switch (number){
            case 1 :
                changePassword();
            case 2 :
                //
            case 3 :
                //
            case 4 :
                //
            case 5 :
                //
            case 6 :
                //
            case 0 :
                //
        }
    }
    public static void changePassword(){
        while(true) {
            System.out.print("New password-->");
            String newPassword = scanner.next();
            System.out.print("Confirm new password-->");
            String cNewPassword = scanner.next();
            if (newPassword == cNewPassword){
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
