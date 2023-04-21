import java.util.Scanner;

public class UserOptions {
    static Scanner scanner = new Scanner(System.in);
    static long charge[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static String user_Origin[] = {"none", "none", "none", "none", "none", "none", "none", "none", "none", "none"};
    static String user_Destination[] = {"none", "none", "none", "none", "none", "none", "none", "none", "none", "none"};
    static String user_Date[] = {"none", "none", "none", "none", "none", "none", "none", "none", "none", "none"};
    static String user_Time[] = {"none", "none", "none", "none", "none", "none", "none", "none", "none", "none"};
    static long user_Price[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int available_Seats[] = {51, 245, 12};
    static int user_Seats[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static String user_FlightId[] = {"none", "none", "none", "none", "none", "none", "none", "none", "none", "none"};
    static String[][] user_Tickets = new String[3][5];
    static int[] number_Tickets = {0,0,0,0,0,0,0,0,0,0};

    //----------------------------------------------------------------------------------------------------------------//
    //Print user menu
    public static void printUserMenu() {
        System.out.print("::::::::::::::::::::::::::::::::::::::::\n" +
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
    //----------------------------------------------------------------------------------------------------------------//
    //User menu
    public static void UserMenu() {
        int number;
        while (true) {
            printUserMenu();
            number = scanner.nextInt();
            switch (number) {
                case 1: {
                    changePassword();
                    break;
                }
                case 2: {
                    search_Flight_Tickets();
                    break;
                }
                case 3: {
                    bookingTicket();
                    break;
                }
                case 4:
                    ticketCancelation();
                    break;
                case 5: {
                    boockedTickets();
                    break;
                }
                case 6: {
                    addCharge();
                    break;
                }
                case 0:
                    FirstMenu.gettingFirstNumber();
                default:
                    break;
            }
            continue;
        }
    }
    //----------------------------------------------------------------------------------------------------------------//
    //User password change function
    public static void changePassword() {
        while (true) {
            System.out.print("New password-->");
            String newPassword = scanner.next();
            System.out.print("Confirm new password-->");
            String cNewPassword = scanner.next();
            if (newPassword.equals(cNewPassword)) {
                FirstMenu.password[FirstMenu.userNumber] = newPassword;
                System.out.println("The password was changed!");
            } else {
                System.out.println("Try again...!");
                continue;
            }
            break;
        }
    }
    //----------------------------------------------------------------------------------------------------------------//
    //Charge boost function
    public static void addCharge() {
        System.out.println("Your charge:" + charge[FirstMenu.userNumber]);
        System.out.print("Enter the desired amount for charging-->");
        charge[FirstMenu.userNumber] += scanner.nextLong();
        System.out.println("charged!" + '\n' + "your charge:" + charge[FirstMenu.userNumber]);
    }
    //----------------------------------------------------------------------------------------------------------------//
    //Ticket purchase function
    public static void bookingTicket() {
        int number;
        while (true) {
            System.out.println("Available tickets:");
            System.out.println("  \t |FlightId \t |Origin \t |Destination \t |Date \t |Time \t |Price \t |Seats |\n" +
                    "...................................................................................\n" +
                    "1) \t |WX-12 \t |Yazd \t |Tehran \t |1401-12-10 \t |12:30 \t |700,000" + '\t' + "|" + available_Seats[0] + '\n' +
                    "...................................................................................\n" +
                    "2) \t |WX-15 \t |Mashhad \t |Ahvaz \t |1401-12-11 \t |08:00 \t |900,000" + '\t' + "|" + available_Seats[1] + '\n' +
                    "...................................................................................\n" +
                    "3) \t |BG-22 \t |Shiraz \t |Tabriz \t |1401-12-12 \t |22:30 \t |1,100,000" + '\t' + "|" + available_Seats[2] + '\n' +
                    "...................................................................................");
            System.out.print("The desired option-->");
            number = scanner.nextInt();
            if (number == 1) {
                if (charge[FirstMenu.userNumber] >= 700_000 && available_Seats[0] > 0 &&
                    number_Tickets[FirstMenu.userNumber] < 3) {
                    user_FlightId[FirstMenu.userNumber] = "WX-12";
                    user_Origin[FirstMenu.userNumber] = "Yazd";
                    user_Destination[FirstMenu.userNumber] = "Tehran";
                    user_Date[FirstMenu.userNumber] = "1401-12-10";
                    user_Time[FirstMenu.userNumber] = "12:30";
                    charge[FirstMenu.userNumber] -= 700_000;
                    user_Price[FirstMenu.userNumber] = 700_000;
                    available_Seats[0] -= 1;
                    System.out.println("reserved!");
                    saveTickets();
                    number_Tickets[FirstMenu.userNumber]++;
                    break;
                } else {
                    System.out.println("Try again...!");
                    break;
                }
            } else if (number == 2) {
                if (charge[FirstMenu.userNumber] >= 900_000 && available_Seats[1] > 0 &&
                    number_Tickets[FirstMenu.userNumber] < 3) {
                    user_FlightId[FirstMenu.userNumber] = "WX-15";
                    user_Origin[FirstMenu.userNumber] = "Mashhad";
                    user_Destination[FirstMenu.userNumber] = "Ahvaz";
                    user_Date[FirstMenu.userNumber] = "1401-12-11";
                    user_Time[FirstMenu.userNumber] = "08:00";
                    charge[FirstMenu.userNumber] -= 900_000;
                    user_Price[FirstMenu.userNumber] = 900_000;
                    available_Seats[1] -= 1;
                    System.out.println("reserved!");
                    saveTickets();
                    number_Tickets[FirstMenu.userNumber]++;
                    break;
                } else {
                    System.out.println("Try again...!");
                    continue;
                }
            } else if (number == 3) {
                if (charge[FirstMenu.userNumber] >= 1_100_000 && available_Seats[2] > 0 &&
                    number_Tickets[FirstMenu.userNumber] < 3) {
                    user_FlightId[FirstMenu.userNumber] = "BG-22";
                    user_Origin[FirstMenu.userNumber] = "Shiraz";
                    user_Destination[FirstMenu.userNumber] = "Tabriz";
                    user_Date[FirstMenu.userNumber] = "1401-12-12";
                    user_Time[FirstMenu.userNumber] = "22:30";
                    charge[FirstMenu.userNumber] -= 1_100_000;
                    user_Price[FirstMenu.userNumber] = 1_100_000;
                    available_Seats[2] -= 1;
                    System.out.println("reserved!");
                    saveTickets();
                    number_Tickets[FirstMenu.userNumber]++;
                    break;
                } else {
                    System.out.println("Try again...!");
                    continue;
                }
            }
            else {
                System.out.println("Try again...!");
                break;
            }
        }
    }
    //----------------------------------------------------------------------------------------------------------------//
    //The function of displaying purchased tickets
    public static void boockedTickets(){
        if (number_Tickets[FirstMenu.userNumber] > 0) {
            for (int i = 0; i < number_Tickets[FirstMenu.userNumber]; i++) {
                System.out.print(i+1 + ")");
                for (int j = 0; j < 5; j++) {
                    System.out.print(user_Tickets[i][j] + '\t');
                }
                System.out.println('\n');
                if (i - 1 < number_Tickets[FirstMenu.userNumber])
                    System.out.print(".................................................................\n");
            }
        }
        else
            System.out.println("No ticket has been reserved!");
    }
    //----------------------------------------------------------------------------------------------------------------//
    //The function of saving tickets for each user
    public static void saveTickets(){
                user_Tickets[number_Tickets[FirstMenu.userNumber]][0] = user_FlightId[FirstMenu.userNumber];
                user_Tickets[number_Tickets[FirstMenu.userNumber]][1] = user_Origin[FirstMenu.userNumber];
                user_Tickets[number_Tickets[FirstMenu.userNumber]][2] = user_Destination[FirstMenu.userNumber];
                user_Tickets[number_Tickets[FirstMenu.userNumber]][3] = user_Date[FirstMenu.userNumber];
                user_Tickets[number_Tickets[FirstMenu.userNumber]][4] = user_Time[FirstMenu.userNumber];
    }
    //----------------------------------------------------------------------------------------------------------------//
    //Ticket search function
    public static void search_Flight_Tickets(){
        System.out.print("Your FlightId-->");
        String letter = scanner.next();
        if (number_Tickets[FirstMenu.userNumber] > 0) {
            for (int i = 0; i < 3; i++) {
                if (user_Tickets[i][0].equals(letter)){
                    for (int j = 0; j < 5; j++) {
                        System.out.print(user_Tickets[i][j]+'\t');
                    }
                }
                else
                    System.out.println("Ticket not found");
                System.out.println('\n');
                break;
            }
        }
        else
            System.out.println("No tickets have been booked!");

    }
    //----------------------------------------------------------------------------------------------------------------//
    //Ticket cancellation function
    public static void ticketCancelation() {
        if (number_Tickets[FirstMenu.userNumber] > 0) {
            boockedTickets();
            System.out.print("Enter the desired ticket number-->");
            int numberical = scanner.nextInt();
            if (numberical == 1) {
                for (int i = 0; i < 5; i++) {
                    user_Tickets[0][i] = "";
                }
                charge[FirstMenu.userNumber] += 700_000;
                available_Seats[0] += 1;
            }
            if (numberical == 2) {
                for (int i = 0; i < 5; i++) {
                    user_Tickets[1][i] = "";
                }
                charge[FirstMenu.userNumber] += 900_000;
                available_Seats[1] += 1;
            }
            if (numberical == 3) {
                for (int i = 0; i < 5; i++) {
                    user_Tickets[2][i] = "";
                }
                charge[FirstMenu.userNumber] += 1_100_000;
                available_Seats[2] += 1;
            }
        }
        else
            System.out.println("No ticket has been reserved!");
    }
}
