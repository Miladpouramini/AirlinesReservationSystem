import java.util.Scanner;

public class Admin {
    static Scanner scanner = new Scanner(System.in);
    public static void printAdminMeno(){
        System.out.println("::::::::::::::::::::::::::::::::::::::::\n" +
                "           Admin MENUE OPTIONS\n" +
                "::::::::::::::::::::::::::::::::::::::::\n" +
                " ......................................\n" +
                "    <1> Add\n" +
                "    <2> Update\n" +
                "    <3> Remove\n" +
                "    <4> Flight schedules\n" +
                "    <0> Sign out");
    }
    public static void adminOptions(){
        printAdminMeno();
        int number = scanner.nextInt();
        switch (number){
            case 0:{
                FirstMeno.gettingFirstNumber();
                break;
            }
            case 1:
                //
            case 2:
                //
            case 3:
                //
            case 4:
                //
            default:
                break;
        }
    }

}
