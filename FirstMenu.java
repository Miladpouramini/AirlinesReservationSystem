import java.util.Scanner;

public class FirstMenu {
    static String[] user = {"aa","bb","cc","dd","ee","ff","gg","hh","ii","kk"};
    static String password[] = {"ll","nn","oo","pp","qq","rr","ss","tt","uu","vv"};
    static String User = "milad";
    static String Password = "pouramini";
    static int counter = 0;
    static Scanner scanner = new Scanner(System.in);
    static int userNumber;

    //----------------------------------------------------------------------------------------------------------------//
    //Primary menu printing function
    public static void printFirstMenu() {
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                "           WELCOME TO AI RELINE RESERVATION SYSTEM\n" +
                "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                "..........................MENU OPTIONS........................\n" +
                "\n" +
                "    <1> Sign in\n" +
                "    <2> Sign up");
    }
    //----------------------------------------------------------------------------------------------------------------//
    //User selection function between registration and login
    public static void gettingFirstNumber(){
        while(true) {
            printFirstMenu();
            System.out.print("-->");
            int number = scanner.nextInt();
            if (number == 1) {
                signIn();
            } else if (number == 2) {
                signUp();
            }
        }
    }
    //----------------------------------------------------------------------------------------------------------------//
    //Registration function
    public static void signUp(){
        boolean check;
        while(true) {
            System.out.print("User-->");
            User = scanner.next();
            check = checkUser();
            if (check) {
                System.out.println("try again...!");
                continue;
            }
            user[counter] = User;
            System.out.print("Password-->");
            Password = scanner.next();
            password[counter] = Password;
            counter++;
            break;
        }
    }
    //----------------------------------------------------------------------------------------------------------------//
    //Duplicate username check function
    public static boolean checkUser()
    {
        boolean count=true;
        for (int i=0;i<10;i++){
            if (user[i].equals(User)){
                count=true;
                break;
            }
            else
                count=false;
        }
        return count;
    }
    //----------------------------------------------------------------------------------------------------------------//
    //Login function
    public static void signIn(){
        String check="Admin";
        while (true) {
            System.out.print("User-->");
            String us = scanner.next();
            System.out.print("Password-->");
            String ps = scanner.next();
            if (checkSignIn(us,ps)) {
                UserOptions.UserMenu();
            } else if (us.equals("Admin") && ps.equals("Admin") || us.equals("admin") && ps.equals("admin")) {
                Admin.adminOptions();
                break;
            } else {
                System.out.println("Try again...!");
                continue;
            }
        }
    }
    //----------------------------------------------------------------------------------------------------------------//
    //Username and password checking function
    public static boolean checkSignIn(String us,String ps){
        boolean count=false;
        for (int i=0;i<10;i++){
            if (user[i].equals(us) && password[i].equals(ps)){
                userNumber = i;
                count=true;
                break;
            }
        }
        return count;
    }
}