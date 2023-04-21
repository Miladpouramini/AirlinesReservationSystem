import java.util.Scanner;

public class UserOptions {
    static Scanner scanner = new Scanner(System.in);
    static long charge[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    //static String available_Origins[] = {"Yazd","Mashhad","Shiraz"};
    static String user_Origin[] = {"none", "none", "none", "none", "none", "none", "none", "none", "none", "none"};
    //static String available_Destination[] = {"Tehran","Ahvaz","Tabriz"};
    static String user_Destination[] = {"none", "none", "none", "none", "none", "none", "none", "none", "none", "none"};
    //static String available_Date[] = {"1401-12-10","1401-12-11","1401-12-12"};
    static String user_Date[] = {"none", "none", "none", "none", "none", "none", "none", "none", "none", "none"};
    //static String available_Time[] = {"12:30","08:00","22:30"};
    static String user_Time[] = {"none", "none", "none", "none", "none", "none", "none", "none", "none", "none"};
    //static long available_Price[] = {700_000,900_000,1_100_000};
    static long user_Price[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int available_Seats[] = {51, 245, 12};
    static int user_Seats[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static String user_FlightId[] = {"none", "none", "none", "none", "none", "none", "none", "none", "none", "none"};

    public static void printUserMeno() {
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
                "    <0> Sign out\n" +
                "-->");
    }

    public static void UserMeno() {
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
                case 3: {
                    bookingTicket();
                    break;
                }
                case 4:
                    //
                case 5:
                    //
                case 6: {
                    addCharge();
                    break;
                }
                case 0:
                    FirstMeno.gettingFirstNumber();
            }
            continue;
        }
    }

    public static void changePassword() {
        while (true) {
            System.out.print("New password-->");
            String newPassword = scanner.next();
            System.out.print("Confirm new password-->");
            String cNewPassword = scanner.next();
            if (newPassword.equals(cNewPassword)) {
                FirstMeno.password[FirstMeno.userNumber] = newPassword;
                System.out.println("The password was changed!");
            } else {
                System.out.println("Try again...!");
                continue;
            }
            break;
        }
    }

    public static void addCharge() {
        System.out.println("Your charge:" + charge[FirstMeno.userNumber]);
        System.out.print("Enter the desired amount for charging-->");
        charge[FirstMeno.userNumber] += scanner.nextLong();
        System.out.println("charged!" + '\n' + "your charge:" + charge[FirstMeno.userNumber]);
    }

    public static void bookingTicket() {
        int number;
        while (true) {
            System.out.println("Available tickets:");
            System.out.println("  \t |FlightId \t |Origin \t |Destination \t |Date \t |Time \t |Price \t |Seats |\n" +
                    "...................................................................................\n" +
                    "1) \t |WX-12 \t |Yazd \t |Tehran \t |1401-12-10 \t |12:30 \t |700,000" + '\t' + "|" + available_Seats[0] + '\n' +
                    "...................................................................................\n" +
                    "1) \t |WX-15 \t |Mashhad \t |Ahvaz \t |1401-12-11 \t |08:00 \t |900,000" + '\t' + "|" + available_Seats[1] + '\n' +
                    "...................................................................................\n" +
                    "1) \t |BG-22 \t |Shiraz \t |Tabriz \t |1401-12-12 \t |22:30 \t |1,100,000" + '\t' + "|" + available_Seats[2] + '\n' +
                    "...................................................................................");
            System.out.print("The desired option-->");
            number = scanner.nextInt();
            if (number == 1) {
                if (charge[FirstMeno.userNumber] >= 700_000 && available_Seats[0] > 0) {
                    user_FlightId[FirstMeno.userNumber] = "WX-12";
                    user_Origin[FirstMeno.userNumber] = "Yazd";
                    user_Destination[FirstMeno.userNumber] = "Tehran";
                    user_Date[FirstMeno.userNumber] = "1401-12-10";
                    user_Time[FirstMeno.userNumber] = "12:30";
                    charge[FirstMeno.userNumber] -= 700_000;
                    user_Price[FirstMeno.userNumber] = 700_000;
                    available_Seats[0] -= 1;
                    System.out.println("reserved!");
                    break;
                } else {
                    System.out.println("Try again...!");
                    break;
                }
            } else if (number == 2) {
                if (charge[FirstMeno.userNumber] >= 900_000 && available_Seats[1] > 0) {
                    user_FlightId[FirstMeno.userNumber] = "WX-15";
                    user_Origin[FirstMeno.userNumber] = "Mashhad";
                    user_Destination[FirstMeno.userNumber] = "Ahvaz";
                    user_Date[FirstMeno.userNumber] = "1401-12-11";
                    user_Time[FirstMeno.userNumber] = "08:00";
                    charge[FirstMeno.userNumber] -= 900_000;
                    user_Price[FirstMeno.userNumber] = 900_000;
                    available_Seats[1] -= 1;
                    System.out.println("reserved!");
                    break;
                } else {
                    System.out.println("Try again...!");
                    continue;
                }
            } else if (number == 3) {
                if (charge[FirstMeno.userNumber] >= 1_100_000 && available_Seats[2] > 0) {
                    user_FlightId[FirstMeno.userNumber] = "BG-22";
                    user_Origin[FirstMeno.userNumber] = "Shiraz";
                    user_Destination[FirstMeno.userNumber] = "Tabriz";
                    user_Date[FirstMeno.userNumber] = "1401-12-12";
                    user_Time[FirstMeno.userNumber] = "22:30";
                    charge[FirstMeno.userNumber] -= 1_100_000;
                    user_Price[FirstMeno.userNumber] = 1_100_000;
                    available_Seats[2] -= 1;
                    System.out.println("reserved!");
                    break;
                } else {
                    System.out.println("Try again...!");
                    continue;
                }
            }
        }
    }
}
