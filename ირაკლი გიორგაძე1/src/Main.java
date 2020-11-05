import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true) {
            System.out.println("airchiet shekitxva: ");
            System.out.println("1) valutis kursi");
            System.out.println("2) failebi");
            Scanner sc=new Scanner(System.in);
            switch(sc.nextInt()) {
                case 1:
                    System.out.println("1 GEL = 0.30 USD");
                    System.out.println("1 GEL = 0.25 EUR");
                    System.out.println("1 GEL = 0.23 POUND");
                    break;
                case 2:
                    System.out.println("Desktop");
                    System.out.println("Downloads");
                    System.out.println("Images");
                    break;
                case -1:
                    return;
                default:
                    System.out.println("სამწუხაროდ ამ კითხვაზე პასუხი არ მაქვს");
            }
        }

    }

}