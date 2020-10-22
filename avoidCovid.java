import java.util.Scanner;

public class avoidCovid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("            Stay Safe " + name.substring(0, 1).toUpperCase() + name.substring(1));
        System.out.println("   ==========================================");
        System.out.println("            Keep Your Community Safe");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        boolean still_alive = true;

        if (still_alive){
            wearMask();
            stay6ftApart();
            washHands();
            getTested();
        }
        System.out.println("\uD83E\uDDA0\uD83D\uDE37\uD83D\uDD2C\uD83C\uDF21");
    }
    public static void wearMask(){
        System.out.println("Wear A Mask \uD83D\uDE37");
    }
    public static void stay6ftApart(){
        System.out.println("Practice Social Distancing \uD83E\uDD13");
    }
    public static void washHands(){
        System.out.println("Keep Your Hands Clean \uD83E\uDDFC");
    }
    public static void getTested(){
        System.out.println("Make Sure To Get Tested \uD83E\uDDEA");
    }
}
