import java.util.Scanner;

public class pubgtest {
    public static void main(String[] args) {
        System.out.println("This is test for PUBG players insert 1 if you think the first answer is true,2 for second!");
        System.out.println("What is PUBG 1 = game 2 = syntax");
        Scanner scan1 = new Scanner(System.in);
        int ans1 = scan1.nextInt();
        System.out.println("What is \"Livik\" 1 = map 2 = gun");
        Scanner scan2 = new Scanner(System.in);
        int ans2 = scan2.nextInt();
        System.out.println("Who better for snipers AWM or Win94");
        Scanner scan3 = new Scanner(System.in);
        int ans3 = scan3.nextInt();
        System.out.println("Who better for fast matches MK416 or AWM");
        Scanner scan4 = new Scanner(System.in);
        int ans4 = scan4.nextInt();
        System.out.println("Who better for noobs Revolvierre or M24");
        Scanner scan5 = new Scanner(System.in);
        int ans5 = scan5.nextInt();
        checkansone(ans1);
        checkanssec(ans2);
        checkansone;
    }

    public static void checkansone(int sol){
        if (sol == 1){
            System.out.println("First answer was True");
        }
        if (sol == 2){
            System.out.println("First answer was False");
        }

    }

}
