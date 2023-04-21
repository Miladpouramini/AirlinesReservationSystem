//Mohammad Milad Pouramini
//AIRLINES RESERVATION SYSTEM
public class Main {
    public static void main(String[] args) {
            try {
                while (true) {
                    FirstMenu.gettingFirstNumber();
                }
            } catch (Exception x) {
                System.err.println("Eror!\nTry again...!"+'\n'+x.getMessage());
            }
        }
    }


